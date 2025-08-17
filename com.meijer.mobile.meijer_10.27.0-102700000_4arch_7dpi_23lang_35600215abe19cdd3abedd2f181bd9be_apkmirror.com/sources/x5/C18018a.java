package x5;

import Q5.InterfaceC5070b;
import Q5.K;
import Q5.t;
import U5.h;
import U5.m;
import U5.p;
import Y5.d;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity;
import d2.C13463b;
import f6.C13846b;
import j.C14791a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t5.C17064a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020!0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%¨\u0006("}, d2 = {"Lx5/a;", "", "LQ5/b;", "appContextService", "<init>", "(LQ5/b;)V", "Landroid/content/Context;", "context", "", "resource", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;I)Landroid/graphics/Bitmap;", "", "e", "()V", "b", "d", "", "c", "()Z", "connected", "f", "(Z)V", "Landroid/graphics/Bitmap;", "backupGraphic", "initialGraphic", "LY5/d;", "LY5/d;", "floatingButtonSettings", "LY5/b;", "LY5/b;", "floatingButtonEventListener", "LU5/h;", "LU5/h;", "floatingButtonPresentation", "LU5/m;", "LU5/m;", "floatingButtonPresentable", "g", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18018a {

    /* renamed from: g, reason: collision with root package name */
    private static final C2712a f169284g = new C2712a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bitmap backupGraphic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bitmap initialGraphic;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d floatingButtonSettings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Y5.b floatingButtonEventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h floatingButtonPresentation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m<h> floatingButtonPresentable;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx5/a$a;", "", "<init>", "()V", "", "GRAPHIC_CORNER_RADIUS", "F", "", "GRAPHIC_HEIGHT_DP", "I", "GRAPHIC_WIDTH_DP", "", "LOG_TAG", "Ljava/lang/String;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: x5.a$a, reason: collision with other inner class name */
    private static final class C2712a {
        public /* synthetic */ C2712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2712a() {
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"x5/a$b", "LY5/b;", "LU5/m;", "LU5/h;", "presentable", "", "c", "(LU5/m;)V", "LU5/p;", "error", "a", "(LU5/m;LU5/p;)V", "b", "i", "f", "d", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: x5.a$b */
    public static final class b implements Y5.b {
        @Override // U5.q
        public void a(m<h> presentable, p error) {
            Intrinsics.j(presentable, "presentable");
            Intrinsics.j(error, "error");
        }

        @Override // U5.q
        public void b(m<h> presentable) {
            Intrinsics.j(presentable, "presentable");
        }

        @Override // U5.q
        public void c(m<h> presentable) {
            Intrinsics.j(presentable, "presentable");
        }

        @Override // U5.q
        public void f(m<h> presentable) {
            Intrinsics.j(presentable, "presentable");
        }

        @Override // Y5.b
        public void i(m<h> presentable) {
            Intrinsics.j(presentable, "presentable");
        }

        @Override // Y5.b
        public void d(m<h> presentable) {
            Unit unit;
            Intrinsics.j(presentable, "presentable");
            Application applicationH = B.h();
            Intent intent = new Intent(applicationH, (Class<?>) AssuranceActivity.class);
            intent.addFlags(65536);
            intent.addFlags(131072);
            intent.addFlags(268435456);
            if (applicationH != null) {
                applicationH.startActivity(intent);
                unit = Unit.f142422a;
            } else {
                unit = null;
            }
            if (unit == null) {
                t.a("Assurance", "AssuranceFloatingButton", "Failed to launch Assurance activity on floating button tap. Host application is null", new Object[0]);
            }
        }

        b() {
        }
    }

    private final Bitmap a(Context context, int resource) {
        if (context == null) {
            t.a("Assurance", "AssuranceFloatingButton", "Failed to get Assurance floating button graphic. Application context is null", new Object[0]);
            return this.backupGraphic;
        }
        Drawable drawableB = C14791a.b(context, resource);
        if (drawableB != null) {
            return C13463b.b(drawableB, 0, 0, null, 7, null);
        }
        t.a("Assurance", "AssuranceFloatingButton", "Failed to get Assurance floating button graphic. Drawable is null", new Object[0]);
        return this.backupGraphic;
    }

    public C18018a(InterfaceC5070b appContextService) {
        Intrinsics.j(appContextService, "appContextService");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        this.backupGraphic = bitmapCreateBitmap;
        Bitmap bitmapA = a(appContextService.getApplicationContext(), C17064a.f161444a);
        this.initialGraphic = bitmapA;
        d dVarA = new d.a().c(80).e(80).b(10.0f).d(bitmapA).a();
        this.floatingButtonSettings = dVarA;
        b bVar = new b();
        this.floatingButtonEventListener = bVar;
        h hVar = new h(dVarA, bVar);
        this.floatingButtonPresentation = hVar;
        this.floatingButtonPresentable = K.f().i().a(hVar, new C13846b());
    }

    public final void b() {
        this.floatingButtonPresentable.b();
    }

    public final boolean c() {
        return this.floatingButtonPresentable.getState() != m.a.DETACHED;
    }

    public final void d() {
        this.floatingButtonPresentable.dismiss();
    }

    public final void e() {
        this.floatingButtonPresentable.a();
    }

    public final void f(boolean connected) {
        Unit unit;
        int i10;
        Context applicationContext = K.f().a().getApplicationContext();
        if (applicationContext != null) {
            if (connected) {
                i10 = C17064a.f161444a;
            } else {
                i10 = C17064a.f161445b;
            }
            ((h) this.floatingButtonPresentable.c()).c().a(a(applicationContext, i10));
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            t.a("Assurance", "AssuranceFloatingButton", "Failed to update Assurance floating button graphic. Application context is null", new Object[0]);
        }
    }
}
