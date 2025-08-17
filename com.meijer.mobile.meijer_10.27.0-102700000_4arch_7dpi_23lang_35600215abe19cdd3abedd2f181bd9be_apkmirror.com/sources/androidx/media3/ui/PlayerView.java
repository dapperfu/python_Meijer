package androidx.media3.ui;

import Ce.L;
import a3.B;
import a3.C5561a;
import a3.F;
import a3.InterfaceC5563c;
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
import c3.C6351b;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import d3.C13466a;
import d3.P;
import h4.C14347B;
import h4.C14349D;
import h4.C14366p;
import h4.C14367q;
import h4.C14370t;
import h4.C14372v;
import h4.C14374x;
import h4.C14376z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class PlayerView extends FrameLayout implements InterfaceC5563c, FSDispatchDraw {

    /* renamed from: A, reason: collision with root package name */
    private boolean f57471A;

    /* renamed from: B, reason: collision with root package name */
    private CharSequence f57472B;

    /* renamed from: C, reason: collision with root package name */
    private int f57473C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f57474D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f57475E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f57476F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f57477G;

    /* renamed from: a, reason: collision with root package name */
    private final c f57478a;

    /* renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f57479b;

    /* renamed from: c, reason: collision with root package name */
    private final View f57480c;

    /* renamed from: d, reason: collision with root package name */
    private final View f57481d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f57482e;

    /* renamed from: f, reason: collision with root package name */
    private final f f57483f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f57484g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f57485h;

    /* renamed from: i, reason: collision with root package name */
    private final SubtitleView f57486i;

    /* renamed from: j, reason: collision with root package name */
    private final View f57487j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f57488k;

    /* renamed from: l, reason: collision with root package name */
    private final PlayerControlView f57489l;

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f57490m;

    /* renamed from: n, reason: collision with root package name */
    private final FrameLayout f57491n;

    /* renamed from: o, reason: collision with root package name */
    private final Handler f57492o;

    /* renamed from: p, reason: collision with root package name */
    private final Class<?> f57493p;

    /* renamed from: q, reason: collision with root package name */
    private final Method f57494q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f57495r;

    /* renamed from: s, reason: collision with root package name */
    private a3.B f57496s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f57497t;

    /* renamed from: u, reason: collision with root package name */
    private d f57498u;

    /* renamed from: v, reason: collision with root package name */
    private PlayerControlView.m f57499v;

    /* renamed from: w, reason: collision with root package name */
    private int f57500w;

    /* renamed from: x, reason: collision with root package name */
    private int f57501x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f57502y;

    /* renamed from: z, reason: collision with root package name */
    private int f57503z;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements B.d, View.OnClickListener, PlayerControlView.m, PlayerControlView.d {

        /* renamed from: a, reason: collision with root package name */
        private final F.b f57504a = new F.b();

        /* renamed from: b, reason: collision with root package name */
        private Object f57505b;

        public c() {
        }

        @Override // androidx.media3.ui.PlayerControlView.m
        public void B(int i10) {
            PlayerView.this.Y();
            if (PlayerView.this.f57498u != null) {
                PlayerView.this.f57498u.a(i10);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.d
        public void E(boolean z10) {
            PlayerView.p(PlayerView.this);
        }

        @Override // a3.B.d
        public void H0(int i10) {
            PlayerView.this.X();
            PlayerView.this.a0();
            PlayerView.this.Z();
        }

        @Override // a3.B.d
        public void L0() {
            if (PlayerView.this.f57480c != null) {
                PlayerView.this.f57480c.setVisibility(4);
                if (PlayerView.this.C()) {
                    PlayerView.this.H();
                } else {
                    PlayerView.this.E();
                }
            }
        }

        @Override // a3.B.d
        public void P0(J j10) {
            a3.B b10 = (a3.B) C13466a.e(PlayerView.this.f57496s);
            F fY = b10.v(17) ? b10.y() : F.f43583a;
            if (fY.q()) {
                this.f57505b = null;
            } else if (!b10.v(30) || b10.r().b()) {
                Object obj = this.f57505b;
                if (obj != null) {
                    int iB = fY.b(obj);
                    if (iB != -1) {
                        if (b10.W() == fY.f(iB, this.f57504a).f43594c) {
                            return;
                        }
                    }
                    this.f57505b = null;
                }
            } else {
                this.f57505b = fY.g(b10.J(), this.f57504a, true).f43593b;
            }
            PlayerView.this.b0(false);
        }

        @Override // a3.B.d
        public void Q0(int i10, int i11) {
            if (P.f127086a == 34 && (PlayerView.this.f57481d instanceof SurfaceView) && PlayerView.this.f57477G) {
                f fVar = (f) C13466a.e(PlayerView.this.f57483f);
                Handler handler = PlayerView.this.f57492o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f57481d;
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
        public void W0(B.e eVar, B.e eVar2, int i10) {
            if (PlayerView.this.K() && PlayerView.this.f57475E) {
                PlayerView.this.G();
            }
        }

        @Override // a3.B.d
        public void a1(boolean z10, int i10) {
            PlayerView.this.X();
            PlayerView.this.Z();
        }

        @Override // a3.B.d
        public void e(N n10) {
            if (n10.equals(N.f43763e) || PlayerView.this.f57496s == null || PlayerView.this.f57496s.U() == 1) {
                return;
            }
            PlayerView.this.W();
        }

        @Override // a3.B.d
        public void i(C6351b c6351b) {
            if (PlayerView.this.f57486i != null) {
                PlayerView.this.f57486i.setCues(c6351b.f61428a);
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
        SurfaceSyncGroup f57507a;

        private f() {
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f57507a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f57507a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.u
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.a(this.f57606a, surfaceView, runnable);
                }
            });
        }

        public static /* synthetic */ void a(f fVar, SurfaceView surfaceView, Runnable runnable) {
            fVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = C14366p.a("exo-sync-b-334901521");
            fVar.f57507a = surfaceSyncGroupA;
            C13466a.g(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.v
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.b();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(C14367q.a());
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
        if (b10 == null || !b10.v(18) || (bArr = b10.f0().f44205i) == null) {
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
        C13466a.g(i10 == 0 || this.f57485h != null);
        if (this.f57500w != i10) {
            this.f57500w = i10;
            b0(false);
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        this.f57498u = dVar;
        if (dVar != null) {
            setControllerVisibilityListener((PlayerControlView.m) null);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        C13466a.g((z10 && this.f57489l == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f57497t == z10) {
            return;
        }
        this.f57497t = z10;
        if (e0()) {
            this.f57489l.setPlayer(this.f57496s);
        } else {
            PlayerControlView playerControlView = this.f57489l;
            if (playerControlView != null) {
                playerControlView.Y();
                this.f57489l.setPlayer(null);
            }
        }
        Y();
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(P.W(context, resources, C14372v.f134373a));
        imageView.setBackgroundColor(resources.getColor(C14370t.f134368a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        a3.B b10 = this.f57496s;
        return b10 != null && this.f57495r != null && b10.v(30) && b10.r().c(4);
    }

    private boolean D() {
        a3.B b10 = this.f57496s;
        return b10 != null && b10.v(30) && b10.r().c(2);
    }

    private void F() {
        ImageView imageView = this.f57485h;
        if (imageView != null) {
            FS.Resources_setImageResource(imageView, R.color.transparent);
            this.f57485h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f57484g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean J() {
        Drawable drawable;
        ImageView imageView = this.f57484g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        a3.B b10 = this.f57496s;
        return b10 != null && b10.v(16) && this.f57496s.j() && this.f57496s.F();
    }

    private void N(final Bitmap bitmap) {
        this.f57492o.post(new Runnable() { // from class: h4.j
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(this.f134364a, bitmap);
            }
        });
    }

    private boolean P(Drawable drawable) {
        if (this.f57485h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f57500w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                M(this.f57479b, width);
                this.f57485h.setScaleType(scaleType);
                this.f57485h.setImageDrawable(drawable);
                this.f57485h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private boolean R() {
        a3.B b10 = this.f57496s;
        if (b10 == null) {
            return true;
        }
        int iU = b10.U();
        if (!this.f57474D) {
            return false;
        }
        if (this.f57496s.v(17) && this.f57496s.y().q()) {
            return false;
        }
        return iU == 1 || iU == 4 || !((a3.B) C13466a.e(this.f57496s)).F();
    }

    private void U() {
        ImageView imageView = this.f57484g;
        if (imageView != null) {
            imageView.setVisibility(0);
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        a3.B b10 = this.f57496s;
        N nL = b10 != null ? b10.L() : N.f43763e;
        int i10 = nL.f43767a;
        int i11 = nL.f43768b;
        M(this.f57479b, this.f57482e ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * nL.f43770d) / i11);
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
            android.view.View r0 = r4.f57487j
            if (r0 == 0) goto L2b
            a3.B r0 = r4.f57496s
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.U()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f57503z
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            a3.B r0 = r4.f57496s
            boolean r0 = r0.F()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f57487j
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
        PlayerControlView playerControlView = this.f57489l;
        if (playerControlView == null || !this.f57497t) {
            setContentDescription(null);
        } else if (playerControlView.c0()) {
            setContentDescription(this.f57476F ? getResources().getString(C14347B.f134257e) : null);
        } else {
            setContentDescription(getResources().getString(C14347B.f134264l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        TextView textView = this.f57488k;
        if (textView != null) {
            CharSequence charSequence = this.f57472B;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f57488k.setVisibility(0);
            } else {
                a3.B b10 = this.f57496s;
                if (b10 != null) {
                    b10.e();
                }
                this.f57488k.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z10) {
        a3.B b10 = this.f57496s;
        boolean z11 = false;
        boolean z12 = (b10 == null || !b10.v(30) || b10.r().b()) ? false : true;
        if (!this.f57471A && (!z12 || z10)) {
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
            View view = this.f57480c;
            if (view != null && view.getVisibility() == 4 && J()) {
                z11 = true;
            }
            if (zC && !zD && z11) {
                y();
                U();
            } else if (zD && !zC && z11) {
                E();
            }
            if (zD || zC || !d0() || !(O(b10) || P(this.f57502y))) {
                F();
            }
        }
    }

    private void c0() {
        Drawable drawable;
        ImageView imageView = this.f57484g;
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
        if (this.f57501x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f57484g.getVisibility() == 0) {
            M(this.f57479b, width);
        }
        this.f57484g.setScaleType(scaleType);
    }

    private boolean d0() {
        if (this.f57500w == 0) {
            return false;
        }
        C13466a.i(this.f57485h);
        return true;
    }

    private boolean e0() {
        if (!this.f57497t) {
            return false;
        }
        C13466a.i(this.f57489l);
        return true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f57484g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        c0();
    }

    private void setImageOutput(a3.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = this.f57493p;
        if (cls == null || !cls.isAssignableFrom(b10.getClass())) {
            return;
        }
        try {
            ((Method) C13466a.e(this.f57494q)).invoke(b10, C13466a.e(this.f57495r));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(a3.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = this.f57493p;
        if (cls == null || !cls.isAssignableFrom(b10.getClass())) {
            return;
        }
        try {
            ((Method) C13466a.e(this.f57494q)).invoke(b10, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f57480c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(P.W(context, resources, C14372v.f134373a));
        imageView.setBackgroundColor(resources.getColor(C14370t.f134368a));
    }

    public void G() {
        PlayerControlView playerControlView = this.f57489l;
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
        a3.B b10 = this.f57496s;
        if (b10 != null && b10.v(16) && this.f57496s.j()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zI = I(keyEvent.getKeyCode());
        if (zI && e0() && !this.f57489l.c0()) {
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

    @Override // a3.InterfaceC5563c
    public List<C5561a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f57491n;
        if (frameLayout != null) {
            arrayList.add(new C5561a.C0937a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        PlayerControlView playerControlView = this.f57489l;
        if (playerControlView != null) {
            arrayList.add(new C5561a.C0937a(playerControlView, 1).a());
        }
        return L.s(arrayList);
    }

    @Override // a3.InterfaceC5563c
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C13466a.j(this.f57490m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f57500w;
    }

    public boolean getControllerAutoShow() {
        return this.f57474D;
    }

    public boolean getControllerHideOnTouch() {
        return this.f57476F;
    }

    public int getControllerShowTimeoutMs() {
        return this.f57473C;
    }

    public Drawable getDefaultArtwork() {
        return this.f57502y;
    }

    public int getImageDisplayMode() {
        return this.f57501x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f57491n;
    }

    public a3.B getPlayer() {
        return this.f57496s;
    }

    public int getResizeMode() {
        C13466a.i(this.f57479b);
        return this.f57479b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f57486i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f57500w != 0;
    }

    public boolean getUseController() {
        return this.f57497t;
    }

    public View getVideoSurfaceView() {
        return this.f57481d;
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        C13466a.i(this.f57479b);
        this.f57479b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f57474D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f57475E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57476F = z10;
        Y();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.d dVar) {
        C13466a.i(this.f57489l);
        this.f57489l.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C13466a.i(this.f57489l);
        this.f57473C = i10;
        if (this.f57489l.c0()) {
            S();
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C13466a.g(this.f57488k != null);
        this.f57472B = charSequence;
        a0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f57502y != drawable) {
            this.f57502y = drawable;
            b0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f57477G = z10;
    }

    public void setErrorMessageProvider(a3.p<? super PlaybackException> pVar) {
        if (pVar != null) {
            a0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        C13466a.i(this.f57489l);
        this.f57489l.setOnFullScreenModeChangedListener(this.f57478a);
    }

    public void setFullscreenButtonState(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.s0(z10);
    }

    public void setImageDisplayMode(int i10) {
        C13466a.g(this.f57484g != null);
        if (this.f57501x != i10) {
            this.f57501x = i10;
            c0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f57471A != z10) {
            this.f57471A = z10;
            b0(false);
        }
    }

    public void setRepeatToggleModes(int i10) {
        C13466a.i(this.f57489l);
        this.f57489l.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        C13466a.i(this.f57479b);
        this.f57479b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f57503z != i10) {
            this.f57503z = i10;
            X();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C13466a.i(this.f57489l);
        this.f57489l.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f57480c;
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
        this.f57478a = cVar;
        this.f57492o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f57479b = null;
            this.f57480c = null;
            this.f57481d = null;
            this.f57482e = false;
            this.f57483f = null;
            this.f57484g = null;
            this.f57485h = null;
            this.f57486i = null;
            this.f57487j = null;
            this.f57488k = null;
            this.f57489l = null;
            this.f57490m = null;
            this.f57491n = null;
            this.f57493p = null;
            this.f57494q = null;
            this.f57495r = null;
            ImageView imageView = new ImageView(context);
            if (P.f127086a >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = C14376z.f134443c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C14349D.f134309b0, i10, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C14349D.f134333n0);
                int color = typedArrayObtainStyledAttributes.getColor(C14349D.f134333n0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134325j0, i21);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134337p0, true);
                int i22 = typedArrayObtainStyledAttributes.getInt(C14349D.f134311c0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134315e0, 0);
                int i23 = typedArrayObtainStyledAttributes.getInt(C14349D.f134321h0, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134339q0, true);
                int i24 = typedArrayObtainStyledAttributes.getInt(C14349D.f134335o0, 1);
                int i25 = typedArrayObtainStyledAttributes.getInt(C14349D.f134327k0, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(C14349D.f134331m0, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134319g0, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134313d0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(C14349D.f134329l0, 0);
                this.f57471A = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134323i0, this.f57471A);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134317f0, true);
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
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C14374x.f134421i);
        this.f57479b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            Q(aspectRatioFrameLayout, i15);
        }
        View viewFindViewById = findViewById(C14374x.f134406N);
        this.f57480c = viewFindViewById;
        if (viewFindViewById != null && z14) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout != null && i16 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 == 2) {
                this.f57481d = new TextureView(context);
            } else if (i16 == 3) {
                try {
                    int i26 = SphericalGLSurfaceView.f57187m;
                    this.f57481d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f57481d.setLayoutParams(layoutParams);
                    this.f57481d.setOnClickListener(cVar);
                    this.f57481d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f57481d, 0);
                    aVar = null;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i16 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (P.f127086a >= 34) {
                    b.a(surfaceView);
                }
                this.f57481d = surfaceView;
            } else {
                try {
                    int i27 = VideoDecoderGLSurfaceView.f56996b;
                    this.f57481d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f57481d.setLayoutParams(layoutParams);
            this.f57481d.setOnClickListener(cVar);
            this.f57481d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f57481d, 0);
            aVar = null;
        } else {
            aVar = null;
            this.f57481d = null;
            z16 = false;
        }
        this.f57482e = z16;
        this.f57483f = P.f127086a == 34 ? new f() : null;
        this.f57490m = (FrameLayout) findViewById(C14374x.f134413a);
        this.f57491n = (FrameLayout) findViewById(C14374x.f134394B);
        this.f57484g = (ImageView) findViewById(C14374x.f134433u);
        this.f57501x = i17;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f56197a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: h4.i
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return PlayerView.b(this.f134363a, obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f57493p = cls;
        this.f57494q = method;
        this.f57495r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(C14374x.f134414b);
        this.f57485h = imageView2;
        this.f57500w = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i14 != 0) {
            this.f57502y = Z1.b.e(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C14374x.f134409Q);
        this.f57486i = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(C14374x.f134418f);
        this.f57487j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f57503z = i13;
        TextView textView = (TextView) findViewById(C14374x.f134426n);
        this.f57488k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(C14374x.f134422j);
        View viewFindViewById3 = findViewById(C14374x.f134423k);
        if (playerControlView != null) {
            this.f57489l = playerControlView;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f57489l = playerControlView2;
            playerControlView2.setId(C14374x.f134422j);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f57489l = null;
        }
        PlayerControlView playerControlView3 = this.f57489l;
        this.f57473C = playerControlView3 != null ? i11 : i20;
        this.f57476F = z11;
        this.f57474D = z12;
        this.f57475E = z13;
        this.f57497t = (!z10 || playerControlView3 == null) ? i20 : 1;
        if (playerControlView3 != null) {
            playerControlView3.Z();
            this.f57489l.S(this.f57478a);
        }
        if (z10) {
            setClickable(true);
        }
        Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f57484g;
        if (imageView != null) {
            FS.Resources_setImageResource(imageView, R.color.transparent);
        }
    }

    private void L(boolean z10) {
        boolean z11;
        if ((!K() || !this.f57475E) && e0()) {
            if (this.f57489l.c0() && this.f57489l.getShowTimeoutMs() <= 0) {
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
        PlayerControlView playerControlView = this.f57489l;
        if (z10) {
            i10 = 0;
        } else {
            i10 = this.f57473C;
        }
        playerControlView.setShowTimeoutMs(i10);
        this.f57489l.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (e0() && this.f57496s != null) {
            if (!this.f57489l.c0()) {
                L(true);
            } else if (this.f57476F) {
                this.f57489l.Y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        if (K() && this.f57475E) {
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
        if (e0() && this.f57489l.U(keyEvent)) {
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
        if (P.f127086a == 34 && (fVar = this.f57483f) != null && this.f57477G) {
            fVar.c();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (e0() && this.f57496s != null) {
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
        C13466a.i(this.f57489l);
        PlayerControlView.m mVar2 = this.f57499v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f57489l.j0(mVar2);
        }
        this.f57499v = mVar;
        if (mVar != null) {
            this.f57489l.S(mVar);
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
        C13466a.g(z10);
        if (b10 != null && b10.z() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        C13466a.a(z11);
        a3.B b11 = this.f57496s;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.Z(this.f57478a);
            if (b11.v(27)) {
                View view = this.f57481d;
                if (view instanceof TextureView) {
                    b11.K((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    b11.Y((SurfaceView) view);
                }
            }
            x(b11);
        }
        SubtitleView subtitleView = this.f57486i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f57496s = b10;
        if (e0()) {
            this.f57489l.setPlayer(b10);
        }
        X();
        a0();
        b0(true);
        if (b10 != null) {
            if (b10.v(27)) {
                View view2 = this.f57481d;
                if (view2 instanceof TextureView) {
                    b10.C((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    b10.o((SurfaceView) view2);
                }
                if (!b10.v(30) || b10.r().d(2)) {
                    W();
                }
            }
            if (this.f57486i != null && b10.v(28)) {
                this.f57486i.setCues(b10.t().f61428a);
            }
            b10.l(this.f57478a);
            setImageOutput(b10);
            L(false);
            return;
        }
        G();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f57481d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
