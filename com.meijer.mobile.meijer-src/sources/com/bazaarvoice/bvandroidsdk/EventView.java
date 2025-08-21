package com.bazaarvoice.bvandroidsdk;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
class EventView {

    interface EventViewListener<ViewType extends View> {
        void onFirstTimeOnScreen();

        void onVisibleOnScreenStateChanged(boolean z10);
    }

    interface ProductView {
        String getProductId();
    }

    static class Subject<ViewType extends View> {
        private ViewType bvView;
        private EventViewListener<ViewType> eventViewListener;
        private final ProductView productView;
        private boolean lastOnScreenState = false;
        private final Rect rect = new Rect();
        private final Point globalOffset = new Point();

        void processEvent(String str) {
            boolean zIsVisibleOnScreen = ViewUtil.isVisibleOnScreen(this.bvView, this.rect, this.globalOffset);
            if (zIsVisibleOnScreen != this.lastOnScreenState) {
                this.eventViewListener.onVisibleOnScreenStateChanged(zIsVisibleOnScreen);
            }
            if (zIsVisibleOnScreen && !ViewUtil.seenOnScreenWithId(this.bvView, this.productView.getProductId())) {
                this.eventViewListener.onFirstTimeOnScreen();
            }
            this.lastOnScreenState = zIsVisibleOnScreen;
        }

        Subject(ViewType viewtype, EventViewListener<ViewType> eventViewListener, ProductView productView) {
            this.bvView = viewtype;
            this.eventViewListener = eventViewListener;
            this.productView = productView;
        }
    }

    static class ViewUtil {
        static boolean isVisibleOnScreen(View view, Rect rect, Point point) {
            if (view != null) {
                return view.getGlobalVisibleRect(rect, point);
            }
            throw new IllegalArgumentException("view must not be null");
        }

        static <ViewType extends View> boolean seenOnScreenWithId(ViewType viewtype, String str) {
            Object tag = viewtype.getTag(O6.a.f23239a);
            if (tag == null) {
                updateSeenId(new HashSet(), viewtype, str);
                return false;
            }
            if (!(tag instanceof Set)) {
                throw new IllegalStateException("ids associated with view are not in expected state");
            }
            Set set = (Set) tag;
            if (set.contains(str)) {
                return true;
            }
            updateSeenId(set, viewtype, str);
            return false;
        }

        ViewUtil() {
        }

        static <ViewType extends View> void updateSeenId(Set<String> set, ViewType viewtype, String str) {
            set.add(str);
            viewtype.setTag(O6.a.f23239a, set);
        }
    }

    @TargetApi(18)
    static class ViewsMovingListener<ViewType extends View> implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
        private final Subject<ViewType> eventViewSubject;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.eventViewSubject.processEvent("onGlobalLayout");
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            this.eventViewSubject.processEvent("onScrollChanged");
        }

        ViewsMovingListener(ViewType viewtype, EventViewListener<ViewType> eventViewListener, ProductView productView) {
            this.eventViewSubject = new Subject<>(viewtype, eventViewListener, productView);
        }
    }

    public static <ViewType extends View> void bind(ViewType viewtype, EventViewListener<ViewType> eventViewListener, ProductView productView) {
        ViewsMovingListener viewsMovingListener = new ViewsMovingListener(viewtype, eventViewListener, productView);
        viewtype.getViewTreeObserver().addOnGlobalLayoutListener(viewsMovingListener);
        viewtype.getViewTreeObserver().addOnScrollChangedListener(viewsMovingListener);
    }

    EventView() {
    }
}
