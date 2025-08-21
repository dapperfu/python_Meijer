package androidx.media3.ui;

import Ee.L;
import a3.B;
import a3.C5644a;
import a3.F;
import a3.InterfaceC5646c;
import a3.J;
import a3.N;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import c3.C6477b;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import d3.C13599a;
import d3.P;
import h4.C14460B;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class PlayerView extends FrameLayout implements InterfaceC5646c, FSDispatchDraw {

    /* renamed from: A, reason: collision with root package name */
    private boolean f57695A;

    /* renamed from: B, reason: collision with root package name */
    private CharSequence f57696B;

    /* renamed from: C, reason: collision with root package name */
    private int f57697C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f57698D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f57699E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f57700F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f57701G;

    /* renamed from: a, reason: collision with root package name */
    private final c f57702a;

    /* renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f57703b;

    /* renamed from: c, reason: collision with root package name */
    private final View f57704c;

    /* renamed from: d, reason: collision with root package name */
    private final View f57705d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f57706e;

    /* renamed from: f, reason: collision with root package name */
    private final f f57707f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f57708g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f57709h;

    /* renamed from: i, reason: collision with root package name */
    private final SubtitleView f57710i;

    /* renamed from: j, reason: collision with root package name */
    private final View f57711j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f57712k;

    /* renamed from: l, reason: collision with root package name */
    private final PlayerControlView f57713l;

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f57714m;

    /* renamed from: n, reason: collision with root package name */
    private final FrameLayout f57715n;

    /* renamed from: o, reason: collision with root package name */
    private final Handler f57716o;

    /* renamed from: p, reason: collision with root package name */
    private final Class<?> f57717p;

    /* renamed from: q, reason: collision with root package name */
    private final Method f57718q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f57719r;

    /* renamed from: s, reason: collision with root package name */
    private a3.B f57720s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f57721t;

    /* renamed from: u, reason: collision with root package name */
    private d f57722u;

    /* renamed from: v, reason: collision with root package name */
    private PlayerControlView.m f57723v;

    /* renamed from: w, reason: collision with root package name */
    private int f57724w;

    /* renamed from: x, reason: collision with root package name */
    private int f57725x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f57726y;

    /* renamed from: z, reason: collision with root package name */
    private int f57727z;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements B.d, View.OnClickListener, PlayerControlView.m, PlayerControlView.d {

        /* renamed from: a, reason: collision with root package name */
        private final F.b f57728a = new F.b();

        /* renamed from: b, reason: collision with root package name */
        private Object f57729b;

        public c() {
        }

        @Override // androidx.media3.ui.PlayerControlView.m
        public void B(int i10) {
            PlayerView.this.Y();
            if (PlayerView.this.f57722u != null) {
                PlayerView.this.f57722u.a(i10);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.d
        public void E(boolean z10) {
            PlayerView.p(PlayerView.this);
        }

        @Override // a3.B.d
        public void K0(int i10) {
            PlayerView.this.X();
            PlayerView.this.a0();
            PlayerView.this.Z();
        }

        @Override // a3.B.d
        public void O0() {
            if (PlayerView.this.f57704c != null) {
                PlayerView.this.f57704c.setVisibility(4);
                if (PlayerView.this.C()) {
                    PlayerView.this.H();
                } else {
                    PlayerView.this.E();
                }
            }
        }

        @Override // a3.B.d
        public void S0(J j10) {
            a3.B b10 = (a3.B) C13599a.e(PlayerView.this.f57720s);
            F fY = b10.v(17) ? b10.y() : F.f44401a;
            if (fY.q()) {
                this.f57729b = null;
            } else if (!b10.v(30) || b10.r().b()) {
                Object obj = this.f57729b;
                if (obj != null) {
                    int iB = fY.b(obj);
                    if (iB != -1) {
                        if (b10.W() == fY.f(iB, this.f57728a).f44412c) {
                            return;
                        }
                    }
                    this.f57729b = null;
                }
            } else {
                this.f57729b = fY.g(b10.J(), this.f57728a, true).f44411b;
            }
            PlayerView.this.b0(false);
        }

        @Override // a3.B.d
        public void T0(int i10, int i11) {
            if (P.f127888a == 34 && (PlayerView.this.f57705d instanceof SurfaceView) && PlayerView.this.f57701G) {
                f fVar = (f) C13599a.e(PlayerView.this.f57707f);
                Handler handler = PlayerView.this.f57716o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f57705d;
                final PlayerView playerView = PlayerView.this;
                fVar.d(handler, surfaceView, new Runnable() { // from class: h4.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // a3.B.d
        public void Z0(B.e eVar, B.e eVar2, int i10) {
            if (PlayerView.this.K() && PlayerView.this.f57699E) {
                PlayerView.this.G();
            }
        }

        @Override // a3.B.d
        public void d1(boolean z10, int i10) {
            PlayerView.this.X();
            PlayerView.this.Z();
        }

        @Override // a3.B.d
        public void e(N n10) {
            if (n10.equals(N.f44581e) || PlayerView.this.f57720s == null || PlayerView.this.f57720s.U() == 1) {
                return;
            }
            PlayerView.this.W();
        }

        @Override // a3.B.d
        public void i(C6477b c6477b) {
            if (PlayerView.this.f57710i != null) {
                PlayerView.this.f57710i.setCues(c6477b.f61227a);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.V();
        }
    }

    public interface d {
        void a(int i10);
    }

    public interface e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f {

        /* renamed from: a, reason: collision with root package name */
        SurfaceSyncGroup f57731a;

        private f() {
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f57731a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f57731a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.u
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.a(this.f57830a, surfaceView, runnable);
                }
            });
        }

        public static /* synthetic */ void a(f fVar, SurfaceView surfaceView, Runnable runnable) {
            fVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = h4.p.a("exo-sync-b-334901521");
            fVar.f57731a = surfaceSyncGroupA;
            C13599a.g(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.v
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.b();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(h4.q.a());
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    @SuppressLint({"InlinedApi"})
    private boolean I(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean O(a3.B b10) {
        byte[] bArr;
        if (b10 == null || !b10.v(18) || (bArr = b10.f0().f45023i) == null) {
            return false;
        }
        return P(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_d17e01b269ed10fbf9cdf6e25277044a(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_d17e01b269ed10fbf9cdf6e25277044a(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_d17e01b269ed10fbf9cdf6e25277044a(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setArtworkDisplayMode(int i10) {
        C13599a.g(i10 == 0 || this.f57709h != null);
        if (this.f57724w != i10) {
            this.f57724w = i10;
            b0(false);
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        this.f57722u = dVar;
        if (dVar != null) {
            setControllerVisibilityListener((PlayerControlView.m) null);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        C13599a.g((z10 && this.f57713l == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f57721t == z10) {
            return;
        }
        this.f57721t = z10;
        if (e0()) {
            this.f57713l.setPlayer(this.f57720s);
        } else {
            PlayerControlView playerControlView = this.f57713l;
            if (playerControlView != null) {
                playerControlView.Y();
                this.f57713l.setPlayer(null);
            }
        }
        Y();
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(P.W(context, resources, h4.v.f134844a));
        imageView.setBackgroundColor(resources.getColor(h4.t.f134839a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        a3.B b10 = this.f57720s;
        return b10 != null && this.f57719r != null && b10.v(30) && b10.r().c(4);
    }

    private boolean D() {
        a3.B b10 = this.f57720s;
        return b10 != null && b10.v(30) && b10.r().c(2);
    }

    private void F() {
        ImageView imageView = this.f57709h;
        if (imageView != null) {
            FS.Resources_setImageResource(imageView, R.color.transparent);
            this.f57709h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f57708g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean J() {
        Drawable drawable;
        ImageView imageView = this.f57708g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        a3.B b10 = this.f57720s;
        return b10 != null && b10.v(16) && this.f57720s.j() && this.f57720s.F();
    }

    private void N(final Bitmap bitmap) {
        this.f57716o.post(new Runnable() { // from class: h4.j
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(this.f134835a, bitmap);
            }
        });
    }

    private boolean P(Drawable drawable) {
        if (this.f57709h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f57724w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                M(this.f57703b, width);
                this.f57709h.setScaleType(scaleType);
                this.f57709h.setImageDrawable(drawable);
                this.f57709h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private boolean R() {
        a3.B b10 = this.f57720s;
        if (b10 == null) {
            return true;
        }
        int iU = b10.U();
        if (!this.f57698D) {
            return false;
        }
        if (this.f57720s.v(17) && this.f57720s.y().q()) {
            return false;
        }
        return iU == 1 || iU == 4 || !((a3.B) C13599a.e(this.f57720s)).F();
    }

    private void U() {
        ImageView imageView = this.f57708g;
        if (imageView != null) {
            imageView.setVisibility(0);
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        a3.B b10 = this.f57720s;
        N nL = b10 != null ? b10.L() : N.f44581e;
        int i10 = nL.f44585a;
        int i11 = nL.f44586b;
        M(this.f57703b, this.f57706e ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * nL.f44588d) / i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X() {
        /*
            r4 = this;
            android.view.View r0 = r4.f57711j
            if (r0 == 0) goto L2b
            a3.B r0 = r4.f57720s
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.U()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f57727z
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            a3.B r0 = r4.f57720s
            boolean r0 = r0.F()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f57711j
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.X():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        PlayerControlView playerControlView = this.f57713l;
        if (playerControlView == null || !this.f57721t) {
            setContentDescription(null);
        } else if (playerControlView.c0()) {
            setContentDescription(this.f57700F ? getResources().getString(C14460B.f134728e) : null);
        } else {
            setContentDescription(getResources().getString(C14460B.f134735l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        TextView textView = this.f57712k;
        if (textView != null) {
            CharSequence charSequence = this.f57696B;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f57712k.setVisibility(0);
            } else {
                a3.B b10 = this.f57720s;
                if (b10 != null) {
                    b10.e();
                }
                this.f57712k.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z10) {
        a3.B b10 = this.f57720s;
        boolean z11 = false;
        boolean z12 = (b10 == null || !b10.v(30) || b10.r().b()) ? false : true;
        if (!this.f57695A && (!z12 || z10)) {
            F();
            y();
            E();
        }
        if (z12) {
            boolean zD = D();
            boolean zC = C();
            if (!zD && !zC) {
                y();
                E();
            }
            View view = this.f57704c;
            if (view != null && view.getVisibility() == 4 && J()) {
                z11 = true;
            }
            if (zC && !zD && z11) {
                y();
                U();
            } else if (zD && !zC && z11) {
                E();
            }
            if (zD || zC || !d0() || !(O(b10) || P(this.f57726y))) {
                F();
            }
        }
    }

    private void c0() {
        Drawable drawable;
        ImageView imageView = this.f57708g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f57725x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f57708g.getVisibility() == 0) {
            M(this.f57703b, width);
        }
        this.f57708g.setScaleType(scaleType);
    }

    private boolean d0() {
        if (this.f57724w == 0) {
            return false;
        }
        C13599a.i(this.f57709h);
        return true;
    }

    private boolean e0() {
        if (!this.f57721t) {
            return false;
        }
        C13599a.i(this.f57713l);
        return true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f57708g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        c0();
    }

    private void setImageOutput(a3.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = this.f57717p;
        if (cls == null || !cls.isAssignableFrom(b10.getClass())) {
            return;
        }
        try {
            ((Method) C13599a.e(this.f57718q)).invoke(b10, C13599a.e(this.f57719r));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(a3.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = this.f57717p;
        if (cls == null || !cls.isAssignableFrom(b10.getClass())) {
            return;
        }
        try {
            ((Method) C13599a.e(this.f57718q)).invoke(b10, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f57704c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(P.W(context, resources, h4.v.f134844a));
        imageView.setBackgroundColor(resources.getColor(h4.t.f134839a));
    }

    public void G() {
        PlayerControlView playerControlView = this.f57713l;
        if (playerControlView != null) {
            playerControlView.Y();
        }
    }

    protected void M(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a3.B b10 = this.f57720s;
        if (b10 != null && b10.v(16) && this.f57720s.j()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zI = I(keyEvent.getKeyCode());
        if (zI && e0() && !this.f57713l.c0()) {
            L(true);
            return true;
        }
        if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            L(true);
            return true;
        }
        if (zI && e0()) {
            L(true);
        }
        return false;
    }

    @Override // a3.InterfaceC5646c
    public List<C5644a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f57715n;
        if (frameLayout != null) {
            arrayList.add(new C5644a.C0939a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        PlayerControlView playerControlView = this.f57713l;
        if (playerControlView != null) {
            arrayList.add(new C5644a.C0939a(playerControlView, 1).a());
        }
        return L.s(arrayList);
    }

    @Override // a3.InterfaceC5646c
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C13599a.j(this.f57714m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f57724w;
    }

    public boolean getControllerAutoShow() {
        return this.f57698D;
    }

    public boolean getControllerHideOnTouch() {
        return this.f57700F;
    }

    public int getControllerShowTimeoutMs() {
        return this.f57697C;
    }

    public Drawable getDefaultArtwork() {
        return this.f57726y;
    }

    public int getImageDisplayMode() {
        return this.f57725x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f57715n;
    }

    public a3.B getPlayer() {
        return this.f57720s;
    }

    public int getResizeMode() {
        C13599a.i(this.f57703b);
        return this.f57703b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f57710i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f57724w != 0;
    }

    public boolean getUseController() {
        return this.f57721t;
    }

    public View getVideoSurfaceView() {
        return this.f57705d;
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        C13599a.i(this.f57703b);
        this.f57703b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f57698D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f57699E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57700F = z10;
        Y();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.d dVar) {
        C13599a.i(this.f57713l);
        this.f57713l.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C13599a.i(this.f57713l);
        this.f57697C = i10;
        if (this.f57713l.c0()) {
            S();
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C13599a.g(this.f57712k != null);
        this.f57696B = charSequence;
        a0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f57726y != drawable) {
            this.f57726y = drawable;
            b0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f57701G = z10;
    }

    public void setErrorMessageProvider(a3.p<? super PlaybackException> pVar) {
        if (pVar != null) {
            a0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        C13599a.i(this.f57713l);
        this.f57713l.setOnFullScreenModeChangedListener(this.f57702a);
    }

    public void setFullscreenButtonState(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.s0(z10);
    }

    public void setImageDisplayMode(int i10) {
        C13599a.g(this.f57708g != null);
        if (this.f57725x != i10) {
            this.f57725x = i10;
            c0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f57695A != z10) {
            this.f57695A = z10;
            b0(false);
        }
    }

    public void setRepeatToggleModes(int i10) {
        C13599a.i(this.f57713l);
        this.f57713l.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        C13599a.i(this.f57703b);
        this.f57703b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f57727z != i10) {
            this.f57727z = i10;
            X();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C13599a.i(this.f57713l);
        this.f57713l.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f57704c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        super(context, attributeSet, i10);
        c cVar = new c();
        this.f57702a = cVar;
        this.f57716o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f57703b = null;
            this.f57704c = null;
            this.f57705d = null;
            this.f57706e = false;
            this.f57707f = null;
            this.f57708g = null;
            this.f57709h = null;
            this.f57710i = null;
            this.f57711j = null;
            this.f57712k = null;
            this.f57713l = null;
            this.f57714m = null;
            this.f57715n = null;
            this.f57717p = null;
            this.f57718q = null;
            this.f57719r = null;
            ImageView imageView = new ImageView(context);
            if (P.f127888a >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = h4.z.f134914c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h4.D.f134780b0, i10, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(h4.D.f134804n0);
                int color = typedArrayObtainStyledAttributes.getColor(h4.D.f134804n0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134796j0, i21);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134808p0, true);
                int i22 = typedArrayObtainStyledAttributes.getInt(h4.D.f134782c0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134786e0, 0);
                int i23 = typedArrayObtainStyledAttributes.getInt(h4.D.f134792h0, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134810q0, true);
                int i24 = typedArrayObtainStyledAttributes.getInt(h4.D.f134806o0, 1);
                int i25 = typedArrayObtainStyledAttributes.getInt(h4.D.f134798k0, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(h4.D.f134802m0, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134790g0, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134784d0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(h4.D.f134800l0, 0);
                this.f57695A = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134794i0, this.f57695A);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134788f0, true);
                typedArrayObtainStyledAttributes.recycle();
                i14 = resourceId2;
                z11 = z19;
                z14 = zHasValue;
                i15 = i25;
                z13 = z21;
                i12 = resourceId;
                z10 = z18;
                z12 = z20;
                z15 = z17;
                i17 = i23;
                i19 = i22;
                i18 = color;
                i16 = i24;
                i13 = integer;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 1;
            i17 = 0;
            i18 = 0;
            i19 = 1;
            z14 = false;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(h4.x.f134892i);
        this.f57703b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            Q(aspectRatioFrameLayout, i15);
        }
        View viewFindViewById = findViewById(h4.x.f134877N);
        this.f57704c = viewFindViewById;
        if (viewFindViewById != null && z14) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout != null && i16 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 == 2) {
                this.f57705d = new TextureView(context);
            } else if (i16 == 3) {
                try {
                    int i26 = SphericalGLSurfaceView.f57411m;
                    this.f57705d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f57705d.setLayoutParams(layoutParams);
                    this.f57705d.setOnClickListener(cVar);
                    this.f57705d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f57705d, 0);
                    aVar = null;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i16 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (P.f127888a >= 34) {
                    b.a(surfaceView);
                }
                this.f57705d = surfaceView;
            } else {
                try {
                    int i27 = VideoDecoderGLSurfaceView.f57220b;
                    this.f57705d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f57705d.setLayoutParams(layoutParams);
            this.f57705d.setOnClickListener(cVar);
            this.f57705d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f57705d, 0);
            aVar = null;
        } else {
            aVar = null;
            this.f57705d = null;
            z16 = false;
        }
        this.f57706e = z16;
        this.f57707f = P.f127888a == 34 ? new f() : null;
        this.f57714m = (FrameLayout) findViewById(h4.x.f134884a);
        this.f57715n = (FrameLayout) findViewById(h4.x.f134865B);
        this.f57708g = (ImageView) findViewById(h4.x.f134904u);
        this.f57725x = i17;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f56421a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: h4.i
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return PlayerView.b(this.f134834a, obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f57717p = cls;
        this.f57718q = method;
        this.f57719r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(h4.x.f134885b);
        this.f57709h = imageView2;
        this.f57724w = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i14 != 0) {
            this.f57726y = Z1.b.e(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(h4.x.f134880Q);
        this.f57710i = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(h4.x.f134889f);
        this.f57711j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f57727z = i13;
        TextView textView = (TextView) findViewById(h4.x.f134897n);
        this.f57712k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(h4.x.f134893j);
        View viewFindViewById3 = findViewById(h4.x.f134894k);
        if (playerControlView != null) {
            this.f57713l = playerControlView;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f57713l = playerControlView2;
            playerControlView2.setId(h4.x.f134893j);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f57713l = null;
        }
        PlayerControlView playerControlView3 = this.f57713l;
        this.f57697C = playerControlView3 != null ? i11 : i20;
        this.f57700F = z11;
        this.f57698D = z12;
        this.f57699E = z13;
        this.f57721t = (!z10 || playerControlView3 == null) ? i20 : 1;
        if (playerControlView3 != null) {
            playerControlView3.Z();
            this.f57713l.S(this.f57702a);
        }
        if (z10) {
            setClickable(true);
        }
        Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f57708g;
        if (imageView != null) {
            FS.Resources_setImageResource(imageView, R.color.transparent);
        }
    }

    private void L(boolean z10) {
        boolean z11;
        if ((!K() || !this.f57699E) && e0()) {
            if (this.f57713l.c0() && this.f57713l.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zR = R();
            if (z10 || z11 || zR) {
                T(zR);
            }
        }
    }

    private static void Q(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private void T(boolean z10) {
        int i10;
        if (!e0()) {
            return;
        }
        PlayerControlView playerControlView = this.f57713l;
        if (z10) {
            i10 = 0;
        } else {
            i10 = this.f57697C;
        }
        playerControlView.setShowTimeoutMs(i10);
        this.f57713l.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (e0() && this.f57720s != null) {
            if (!this.f57713l.c0()) {
                L(true);
            } else if (this.f57700F) {
                this.f57713l.Y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        if (K() && this.f57699E) {
            G();
        } else {
            L(false);
        }
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (!playerView.D()) {
            playerView.U();
            playerView.y();
        }
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object obj, Method method, Object[] objArr) {
        playerView.getClass();
        if (method.getName().equals("onImageAvailable")) {
            playerView.N((Bitmap) objArr[1]);
            return null;
        }
        return null;
    }

    static /* synthetic */ e p(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    public boolean B(KeyEvent keyEvent) {
        if (e0() && this.f57713l.U(keyEvent)) {
            return true;
        }
        return false;
    }

    public void S() {
        T(R());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        fsSuperDispatchDraw_d17e01b269ed10fbf9cdf6e25277044a(canvas);
        if (P.f127888a == 34 && (fVar = this.f57707f) != null && this.f57701G) {
            fVar.c();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (e0() && this.f57720s != null) {
            L(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        V();
        return super.performClick();
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.m mVar) {
        C13599a.i(this.f57713l);
        PlayerControlView.m mVar2 = this.f57723v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f57713l.j0(mVar2);
        }
        this.f57723v = mVar;
        if (mVar != null) {
            this.f57713l.S(mVar);
            setControllerVisibilityListener((d) null);
        }
    }

    public void setPlayer(a3.B b10) {
        boolean z10;
        boolean z11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        if (b10 != null && b10.z() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        C13599a.a(z11);
        a3.B b11 = this.f57720s;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.Z(this.f57702a);
            if (b11.v(27)) {
                View view = this.f57705d;
                if (view instanceof TextureView) {
                    b11.K((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    b11.Y((SurfaceView) view);
                }
            }
            x(b11);
        }
        SubtitleView subtitleView = this.f57710i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f57720s = b10;
        if (e0()) {
            this.f57713l.setPlayer(b10);
        }
        X();
        a0();
        b0(true);
        if (b10 != null) {
            if (b10.v(27)) {
                View view2 = this.f57705d;
                if (view2 instanceof TextureView) {
                    b10.C((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    b10.o((SurfaceView) view2);
                }
                if (!b10.v(30) || b10.r().d(2)) {
                    W();
                }
            }
            if (this.f57710i != null && b10.v(28)) {
                this.f57710i.setCues(b10.t().f61227a);
            }
            b10.l(this.f57702a);
            setImageOutput(b10);
            L(false);
            return;
        }
        G();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f57705d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
