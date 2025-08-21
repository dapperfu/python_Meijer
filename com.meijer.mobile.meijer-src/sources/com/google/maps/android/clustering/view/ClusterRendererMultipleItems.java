package com.google.maps.android.clustering.view;

import Md.C4110c;
import Md.C4117j;
import Od.C4455c;
import Od.C4456d;
import Od.C4466n;
import Od.C4467o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.R;
import com.google.maps.android.RendererLogger;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public class ClusterRendererMultipleItems<T extends ClusterItem> implements ClusterRenderer<T> {
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private final MarkerCache<Cluster<T>> mClusterMarkerCache;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    private final C4110c mMap;
    private final MarkerCache<T> mMarkerCache;
    private float mZoom;
    private static TimeInterpolator animationInterp = new DecelerateInterpolator();
    private static final int[] BUCKETS = {10, 20, 50, 100, HttpResponseStatus.SUCCESS_OK, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, 1000};
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> ongoingAnimations = new LinkedList();
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private final SparseArray<C4455c> mIcons = new SparseArray<>();
    private int mMinClusterSize = 2;
    private final ClusterRendererMultipleItems<T>.ViewModifier mViewModifier = new ViewModifier(Looper.getMainLooper());
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* JADX INFO: Access modifiers changed from: private */
    class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private final Lock lock;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final C4466n marker;
        private final MarkerWithPosition markerWithPosition;

        /* renamed from: to, reason: collision with root package name */
        private final LatLng f90558to;
        private ValueAnimator valueAnimator;

        public void perform() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(ClusterRendererMultipleItems.animationInterp);
            this.valueAnimator.setDuration(ClusterRendererMultipleItems.this.mAnimationDurationMs);
            this.valueAnimator.addUpdateListener(this);
            this.valueAnimator.addListener(this);
            this.valueAnimator.start();
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, Lock lock) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.f90558to = latLng2;
            this.lock = lock;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                ClusterRendererMultipleItems.this.mMarkerCache.remove(this.marker);
                ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.f90558to;
            this.lock.lock();
            ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
            this.lock.unlock();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f90558to == null || this.from == null || this.marker == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f90558to;
            double d10 = latLng.f85654a;
            LatLng latLng2 = this.from;
            double d11 = latLng2.f85654a;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double dSignum = latLng.f85655b - latLng2.f85655b;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            LatLng latLng3 = new LatLng(d13, (dSignum * d12) + this.from.f85655b);
            this.marker.n(latLng3);
            this.markerWithPosition.position = latLng3;
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        public void cancel() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.clustering.view.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90567a.cancel();
                    }
                });
                return;
            }
            try {
                this.markerWithPosition.position = this.f90558to;
                this.mRemoveOnComplete = false;
                this.valueAnimator.cancel();
                this.lock.lock();
                ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
            } finally {
                this.lock.unlock();
            }
        }
    }

    public enum AnimationType {
        LINEAR,
        EASE_IN,
        EASE_OUT,
        EASE_IN_OUT,
        FAST_OUT_SLOW_IN,
        BOUNCE,
        ACCELERATE,
        DECELERATE
    }

    private class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(ClusterRendererMultipleItems<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            i iVar = null;
            if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(this.cluster)) {
                RendererLogger.d("ClusterRenderer", "Rendering cluster marker at position: " + this.cluster.getPosition());
                C4466n c4466nAddMarker = ClusterRendererMultipleItems.this.mClusterMarkerCache.get((MarkerCache) this.cluster);
                if (c4466nAddMarker == null) {
                    RendererLogger.d("ClusterRenderer", "Creating new cluster marker");
                    C4467o c4467o = new C4467o();
                    LatLng position = this.animateFrom;
                    if (position == null) {
                        position = this.cluster.getPosition();
                    }
                    C4467o c4467oU3 = c4467o.U3(position);
                    ClusterRendererMultipleItems.this.onBeforeClusterRendered(this.cluster, c4467oU3);
                    c4466nAddMarker = ClusterRendererMultipleItems.this.mClusterManager.getClusterMarkerCollection().addMarker(c4467oU3);
                    ClusterRendererMultipleItems.this.mClusterMarkerCache.put(this.cluster, c4466nAddMarker);
                    markerWithPosition = new MarkerWithPosition(c4466nAddMarker, iVar);
                    LatLng latLng = this.animateFrom;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.cluster.getPosition());
                        RendererLogger.d("ClusterRenderer", "Animating cluster marker from " + this.animateFrom + " to " + this.cluster.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(c4466nAddMarker, iVar);
                    RendererLogger.d("ClusterRenderer", "Updating existing cluster marker");
                    ClusterRendererMultipleItems.this.onClusterUpdated(this.cluster, c4466nAddMarker);
                }
                ClusterRendererMultipleItems.this.onClusterRendered(this.cluster, c4466nAddMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            RendererLogger.d("ClusterRenderer", "Rendering individual cluster items, count: " + this.cluster.getItems().size());
            for (T t10 : this.cluster.getItems()) {
                C4466n c4466nAddMarker2 = ClusterRendererMultipleItems.this.mMarkerCache.get((MarkerCache) t10);
                LatLng position2 = t10.getPosition();
                if (c4466nAddMarker2 == null) {
                    RendererLogger.d("ClusterRenderer", "Creating new marker for cluster item at position: " + position2);
                    C4467o c4467o2 = new C4467o();
                    if (this.animateFrom != null) {
                        RendererLogger.d("ClusterRenderer", "Animating from position: " + this.animateFrom);
                        c4467o2.U3(this.animateFrom);
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(t10)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t11 = null;
                        while (it.hasNext()) {
                            Iterator<T> it2 = ((Cluster) it.next()).getItems().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    T next = it2.next();
                                    if (next.equals(t10)) {
                                        t11 = next;
                                        break;
                                    }
                                }
                            }
                        }
                        position2 = t11.getPosition();
                        RendererLogger.d("ClusterRenderer", "Found item in cache for animation at position: " + position2);
                        c4467o2.U3(position2);
                    } else {
                        c4467o2.U3(t10.getPosition());
                        if (t10.getZIndex() != null) {
                            c4467o2.Z3(t10.getZIndex().floatValue());
                        }
                    }
                    ClusterRendererMultipleItems.this.onBeforeClusterItemRendered(t10, c4467o2);
                    c4466nAddMarker2 = ClusterRendererMultipleItems.this.mClusterManager.getMarkerCollection().addMarker(c4467o2);
                    markerWithPosition2 = new MarkerWithPosition(c4466nAddMarker2, t10);
                    ClusterRendererMultipleItems.this.mMarkerCache.put(t10, c4466nAddMarker2);
                    LatLng latLng2 = this.animateFrom;
                    if (latLng2 != null) {
                        markerModifier.animate(markerWithPosition2, latLng2, t10.getPosition());
                        RendererLogger.d("ClusterRenderer", "Animating marker from " + this.animateFrom + " to " + t10.getPosition());
                    } else if (position2 != null) {
                        markerModifier.animate(markerWithPosition2, position2, t10.getPosition());
                        RendererLogger.d("ClusterRenderer", "Animating marker from " + position2 + " to " + t10.getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(c4466nAddMarker2, t10);
                    markerModifier.animate(markerWithPosition2, c4466nAddMarker2.b(), t10.getPosition());
                    RendererLogger.d("ClusterRenderer", "Animating existing marker from " + c4466nAddMarker2.b() + " to " + t10.getPosition());
                    if (!markerWithPosition2.position.equals(t10.getPosition())) {
                        RendererLogger.d("ClusterRenderer", "Updating cluster item marker position");
                        ClusterRendererMultipleItems.this.onClusterItemUpdated(t10, c4466nAddMarker2);
                    }
                }
                ClusterRendererMultipleItems.this.onClusterItemRendered(t10, c4466nAddMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    private static class MarkerCache<T> {
        private final Map<T, C4466n> mCache;
        private final Map<C4466n, T> mCacheReverse;

        public C4466n get(T t10) {
            return this.mCache.get(t10);
        }

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public T get(C4466n c4466n) {
            return this.mCacheReverse.get(c4466n);
        }

        public void put(T t10, C4466n c4466n) {
            this.mCache.put(t10, c4466n);
            this.mCacheReverse.put(c4466n, t10);
        }

        public void remove(C4466n c4466n) {
            T t10 = this.mCacheReverse.get(c4466n);
            this.mCacheReverse.remove(c4466n);
            this.mCache.remove(t10);
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> mAnimationTasks;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private final Queue<C4466n> mOnScreenRemoveMarkerTasks;
        private final Queue<C4466n> mRemoveMarkerTasks;

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.AnimationTask animationTaskPoll = this.mAnimationTasks.poll();
                Objects.requireNonNull(animationTaskPoll);
                animationTaskPoll.perform();
            } else if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTaskPoll = this.mOnScreenCreateMarkerTasks.poll();
                Objects.requireNonNull(createMarkerTaskPoll);
                createMarkerTaskPoll.perform(this);
            } else if (this.mCreateMarkerTasks.isEmpty()) {
                if (this.mRemoveMarkerTasks.isEmpty()) {
                    return;
                }
                removeMarker(this.mRemoveMarkerTasks.poll());
            } else {
                ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTaskPoll2 = this.mCreateMarkerTasks.poll();
                Objects.requireNonNull(createMarkerTaskPoll2);
                createMarkerTaskPoll2.perform(this);
            }
        }

        private void removeMarker(C4466n c4466n) {
            ClusterRendererMultipleItems.this.mMarkerCache.remove(c4466n);
            ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(c4466n);
            ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager().remove(c4466n);
        }

        public void add(boolean z10, ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2, this.lock);
            Iterator it = ClusterRendererMultipleItems.this.ongoingAnimations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnimationTask animationTask2 = (AnimationTask) it.next();
                if (animationTask2.marker.a().equals(((AnimationTask) animationTask).marker.a())) {
                    animationTask2.cancel();
                    break;
                }
            }
            this.mAnimationTasks.add(animationTask);
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2, this.lock);
            Iterator it = ClusterRendererMultipleItems.this.ongoingAnimations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnimationTask animationTask2 = (AnimationTask) it.next();
                if (animationTask2.marker.a().equals(((AnimationTask) animationTask).marker.a())) {
                    animationTask2.cancel();
                    break;
                }
            }
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            animationTask.removeOnAnimationComplete(ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    performNextTask();
                } catch (Throwable th2) {
                    this.lock.unlock();
                    throw th2;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
            this.lock.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean isBusy() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock     // Catch: java.lang.Throwable -> L30
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.Queue<com.google.maps.android.clustering.view.ClusterRendererMultipleItems<T>$CreateMarkerTask> r0 = r2.mCreateMarkerTasks     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue<com.google.maps.android.clustering.view.ClusterRendererMultipleItems<T>$CreateMarkerTask> r0 = r2.mOnScreenCreateMarkerTasks     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue<Od.n> r0 = r2.mOnScreenRemoveMarkerTasks     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue<Od.n> r0 = r2.mRemoveMarkerTasks     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L32
                java.util.Queue<com.google.maps.android.clustering.view.ClusterRendererMultipleItems<T>$AnimationTask> r0 = r2.mAnimationTasks     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r0 != 0) goto L2e
                goto L32
            L2e:
                r0 = 0
                goto L33
            L30:
                r0 = move-exception
                goto L39
            L32:
                r0 = 1
            L33:
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                return r0
            L39:
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.ClusterRendererMultipleItems.MarkerModifier.isBusy():boolean");
        }

        public void remove(boolean z10, C4466n c4466n) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z10) {
                this.mOnScreenRemoveMarkerTasks.add(c4466n);
            } else {
                this.mRemoveMarkerTasks.add(c4466n);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }
    }

    private static class MarkerWithPosition<T> {
        private final T clusterItem;
        private final C4466n marker;
        private LatLng position;

        private MarkerWithPosition(C4466n c4466n, T t10) {
            this.marker = c4466n;
            this.clusterItem = t10;
            this.position = c4466n.b();
        }

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }
    }

    private class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private C4117j mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBoundsA;
            ArrayList arrayList;
            ArrayList arrayList2;
            MarkerModifier markerModifier = new MarkerModifier();
            float f10 = this.mMapZoom;
            Set<MarkerWithPosition> set = ClusterRendererMultipleItems.this.mMarkers;
            try {
                latLngBoundsA = this.mProjection.a().f23592e;
                RendererLogger.d("ClusterRenderer", "Visible bounds calculated: " + latLngBoundsA);
            } catch (Exception unused) {
                RendererLogger.e("ClusterRenderer", "Error getting visible bounds, defaulting to (0,0)");
                latLngBoundsA = LatLngBounds.B().b(new LatLng(0.0d, 0.0d)).a();
            }
            if (ClusterRendererMultipleItems.this.mClusters == null || !ClusterRendererMultipleItems.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : ClusterRendererMultipleItems.this.mClusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster) && latLngBoundsA.T(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
                RendererLogger.d("ClusterRenderer", "Existing clusters on screen found: " + arrayList.size());
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean zT = latLngBoundsA.T(cluster2.getPosition());
                if (ClusterRendererMultipleItems.this.mAnimate) {
                    Point pointFindClosestCluster = ClusterRendererMultipleItems.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (pointFindClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster)));
                        RendererLogger.d("ClusterRenderer", "Animating cluster from closest cluster: " + cluster2.getPosition());
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                        RendererLogger.d("ClusterRenderer", "Animating cluster without closest point: " + cluster2.getPosition());
                    }
                } else {
                    markerModifier.add(zT, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    RendererLogger.d("ClusterRenderer", "Adding cluster without animation: " + cluster2.getPosition());
                }
            }
            markerModifier.waitUntilFree();
            RendererLogger.d("ClusterRenderer", "All new markers added, count: " + setNewSetFromMap.size());
            set.removeAll(setNewSetFromMap);
            RendererLogger.d("ClusterRenderer", "Markers to remove after filtering new markers: " + set.size());
            if (ClusterRendererMultipleItems.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster3) && latLngBoundsA.T(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
                RendererLogger.d("ClusterRenderer", "New clusters on screen found: " + arrayList2.size());
            } else {
                arrayList2 = null;
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean zT2 = latLngBoundsA.T(markerWithPosition.position);
                if (zT2 && ClusterRendererMultipleItems.this.mAnimate) {
                    Point pointFindClosestCluster2 = ClusterRendererMultipleItems.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (pointFindClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster2));
                        RendererLogger.d("ClusterRenderer", "Animating then removing marker at position: " + markerWithPosition.position);
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(markerWithPosition.clusterItem)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t10 = null;
                        while (it.hasNext()) {
                            Iterator<T> it2 = ((Cluster) it.next()).getItems().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    T next = it2.next();
                                    if (next.equals(markerWithPosition.clusterItem)) {
                                        t10 = next;
                                        break;
                                    }
                                }
                            }
                        }
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, t10.getPosition());
                        RendererLogger.d("ClusterRenderer", "Animating then removing marker joining cluster at position: " + markerWithPosition.position);
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                        RendererLogger.d("ClusterRenderer", "Removing marker without animation at position: " + markerWithPosition.position);
                    }
                } else {
                    markerModifier.remove(zT2, markerWithPosition.marker);
                    RendererLogger.d("ClusterRenderer", "Removing marker (onScreen=" + zT2 + ") at position: " + markerWithPosition.position);
                }
            }
            markerModifier.waitUntilFree();
            RendererLogger.d("ClusterRenderer", "All marker removal operations completed.");
            ClusterRendererMultipleItems.this.mMarkers = setNewSetFromMap;
            ClusterRendererMultipleItems.this.mClusters = this.clusters;
            ClusterRendererMultipleItems.this.mZoom = f10;
            this.mCallback.run();
            RendererLogger.d("ClusterRenderer", "Cluster update callback executed.");
        }

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f10) {
            this.mMapZoom = f10;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f10, ClusterRendererMultipleItems.this.mZoom)) * 256.0d);
        }

        public void setProjection(C4117j c4117j) {
            this.mProjection = c4117j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private ClusterRendererMultipleItems<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }

        public ViewModifier(Looper looper) {
            super(looper);
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ClusterRendererMultipleItems<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            C4117j c4117jK = ClusterRendererMultipleItems.this.mMap.k();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new Runnable() { // from class: com.google.maps.android.clustering.view.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90568a.lambda$handleMessage$0();
                }
            });
            renderTask.setProjection(c4117jK);
            renderTask.setMapZoom(ClusterRendererMultipleItems.this.mMap.j().f85647b);
            ClusterRendererMultipleItems.this.mExecutor.execute(renderTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d10 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            for (Point point3 : list) {
                double dDistanceSquared = distanceSquared(point3, point);
                if (dDistanceSquared < d10) {
                    point2 = point3;
                    d10 = dDistanceSquared;
                }
            }
        }
        return point2;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i10) {
        float fMin = 300.0f - Math.min(i10, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public C4466n getMarker(T t10) {
        return this.mMarkerCache.get((MarkerCache<T>) t10);
    }

    protected void onClusterItemRendered(T t10, C4466n c4466n) {
    }

    protected void onClusterRendered(Cluster<T> cluster, C4466n c4466n) {
    }

    /* renamed from: com.google.maps.android.clustering.view.ClusterRendererMultipleItems$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType = iArr;
            try {
                iArr[AnimationType.EASE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.ACCELERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_IN_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.FAST_OUT_SLOW_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.BOUNCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.DECELERATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static double distanceSquared(Point point, Point point2) {
        double d10 = point.f91175x;
        double d11 = point2.f91175x;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = point.f91176y;
        double d14 = point2.f91176y;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$0(C4466n c4466n) {
        RendererLogger.d("ClusterRenderer", "Marker clicked: " + c4466n);
        ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener = this.mItemClickListener;
        return onClusterItemClickListener != null && onClusterItemClickListener.onClusterItemClick(this.mMarkerCache.get(c4466n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$1(C4466n c4466n) {
        RendererLogger.d("ClusterRenderer", "Info window clicked for marker: " + c4466n);
        ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener = this.mItemInfoWindowClickListener;
        if (onClusterItemInfoWindowClickListener != null) {
            onClusterItemInfoWindowClickListener.onClusterItemInfoWindowClick(this.mMarkerCache.get(c4466n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$2(C4466n c4466n) {
        RendererLogger.d("ClusterRenderer", "Info window long-clicked for marker: " + c4466n);
        ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener = this.mItemInfoWindowLongClickListener;
        if (onClusterItemInfoWindowLongClickListener != null) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick(this.mMarkerCache.get(c4466n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$3(C4466n c4466n) {
        ClusterManager.OnClusterClickListener<T> onClusterClickListener = this.mClickListener;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick(this.mClusterMarkerCache.get(c4466n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$4(C4466n c4466n) {
        RendererLogger.d("ClusterRenderer", "Info window clicked for cluster marker: " + c4466n);
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(c4466n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$5(C4466n c4466n) {
        RendererLogger.d("ClusterRenderer", "Info window long-clicked for cluster marker: " + c4466n);
        ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener = this.mInfoWindowLongClickListener;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick(this.mClusterMarkerCache.get(c4466n));
        }
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i10 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i10 = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i10, i10, i10, i10);
        return squareTextView;
    }

    public Cluster<T> getCluster(C4466n c4466n) {
        return this.mClusterMarkerCache.get(c4466n);
    }

    public T getClusterItem(C4466n c4466n) {
        return this.mMarkerCache.get(c4466n);
    }

    protected String getClusterText(int i10) {
        if (i10 < BUCKETS[0]) {
            return String.valueOf(i10);
        }
        return i10 + "+";
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getClusterTextAppearance(int i10) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    public C4466n getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get((MarkerCache<Cluster<T>>) cluster);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        RendererLogger.d("ClusterRenderer", "Setting up MarkerCollection listeners");
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new C4110c.p() { // from class: com.google.maps.android.clustering.view.a
            @Override // Md.C4110c.p
            public final boolean onMarkerClick(C4466n c4466n) {
                return this.f90561a.lambda$onAdd$0(c4466n);
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new C4110c.j() { // from class: com.google.maps.android.clustering.view.b
            @Override // Md.C4110c.j
            public final void onInfoWindowClick(C4466n c4466n) {
                this.f90562a.lambda$onAdd$1(c4466n);
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new C4110c.l() { // from class: com.google.maps.android.clustering.view.c
            @Override // Md.C4110c.l
            public final void onInfoWindowLongClick(C4466n c4466n) {
                this.f90563a.lambda$onAdd$2(c4466n);
            }
        });
        RendererLogger.d("ClusterRenderer", "Setting up ClusterMarkerCollection listeners");
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new C4110c.p() { // from class: com.google.maps.android.clustering.view.d
            @Override // Md.C4110c.p
            public final boolean onMarkerClick(C4466n c4466n) {
                return this.f90564a.lambda$onAdd$3(c4466n);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new C4110c.j() { // from class: com.google.maps.android.clustering.view.e
            @Override // Md.C4110c.j
            public final void onInfoWindowClick(C4466n c4466n) {
                this.f90565a.lambda$onAdd$4(c4466n);
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new C4110c.l() { // from class: com.google.maps.android.clustering.view.f
            @Override // Md.C4110c.l
            public final void onInfoWindowLongClick(C4466n c4466n) {
                this.f90566a.lambda$onAdd$5(c4466n);
            }
        });
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z10) {
        this.mAnimate = z10;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j10) {
        this.mAnimationDurationMs = j10;
    }

    public void setAnimationType(AnimationType animationType) {
        switch (AnonymousClass1.$SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[animationType.ordinal()]) {
            case 1:
            case 2:
                animationInterp = new AccelerateInterpolator();
                break;
            case 3:
                animationInterp = new DecelerateInterpolator();
                break;
            case 4:
                animationInterp = new AccelerateDecelerateInterpolator();
                break;
            case 5:
                animationInterp = new Q2.b();
                break;
            case 6:
                animationInterp = new BounceInterpolator();
                break;
            case 7:
                animationInterp = new DecelerateInterpolator();
                break;
            default:
                animationInterp = new LinearInterpolator();
                break;
        }
    }

    public void setMinClusterSize(int i10) {
        this.mMinClusterSize = i10;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    public void stopAnimation() {
        Iterator<ClusterRendererMultipleItems<T>.AnimationTask> it = this.ongoingAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public ClusterRendererMultipleItems(Context context, C4110c c4110c, ClusterManager<T> clusterManager) {
        this.mMarkerCache = new MarkerCache<>();
        this.mClusterMarkerCache = new MarkerCache<>();
        this.mMap = c4110c;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    protected int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int i10 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i10 < iArr.length - 1) {
                int i11 = i10 + 1;
                if (size < iArr[i11]) {
                    return iArr[i10];
                }
                i10 = i11;
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    protected C4455c getDescriptorForCluster(Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        C4455c c4455c = this.mIcons.get(bucket);
        if (c4455c == null) {
            this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
            this.mIconGenerator.setTextAppearance(getClusterTextAppearance(bucket));
            C4455c c4455cB = C4456d.b(this.mIconGenerator.makeIcon(getClusterText(bucket)));
            this.mIcons.put(bucket, c4455cB);
            return c4455cB;
        }
        return c4455c;
    }

    protected void onBeforeClusterItemRendered(T t10, C4467o c4467o) {
        if (t10.getTitle() != null && t10.getSnippet() != null) {
            c4467o.X3(t10.getTitle());
            c4467o.W3(t10.getSnippet());
        } else if (t10.getTitle() != null) {
            c4467o.X3(t10.getTitle());
        } else if (t10.getSnippet() != null) {
            c4467o.X3(t10.getSnippet());
        }
    }

    protected void onBeforeClusterRendered(Cluster<T> cluster, C4467o c4467o) {
        c4467o.L2(getDescriptorForCluster(cluster));
    }

    protected void onClusterItemUpdated(T t10, C4466n c4466n) {
        boolean z10 = true;
        boolean z11 = false;
        if (t10.getTitle() != null && t10.getSnippet() != null) {
            if (!t10.getTitle().equals(c4466n.d())) {
                c4466n.r(t10.getTitle());
                z11 = true;
            }
            if (!t10.getSnippet().equals(c4466n.c())) {
                c4466n.p(t10.getSnippet());
                z11 = true;
            }
        } else {
            if (t10.getSnippet() != null && !t10.getSnippet().equals(c4466n.d())) {
                c4466n.r(t10.getSnippet());
            } else if (t10.getTitle() != null && !t10.getTitle().equals(c4466n.d())) {
                c4466n.r(t10.getTitle());
            }
            z11 = true;
        }
        if (!c4466n.b().equals(t10.getPosition())) {
            c4466n.n(t10.getPosition());
            if (t10.getZIndex() != null) {
                c4466n.t(t10.getZIndex().floatValue());
            }
        } else {
            z10 = z11;
        }
        if (z10 && c4466n.f()) {
            c4466n.u();
        }
    }

    protected void onClusterUpdated(Cluster<T> cluster, C4466n c4466n) {
        c4466n.l(getDescriptorForCluster(cluster));
    }

    public void setLoggingEnabled(boolean z10) {
        RendererLogger.setEnabled(z10);
    }

    protected boolean shouldRenderAsCluster(Cluster<T> cluster) {
        if (cluster.getSize() >= this.mMinClusterSize) {
            return true;
        }
        return false;
    }
}
