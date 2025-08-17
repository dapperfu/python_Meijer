package Q6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bugsnag.android.A0;
import com.bugsnag.android.B;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.C;
import com.bugsnag.android.C6496u;
import com.bugsnag.android.D;
import com.bugsnag.android.InterfaceC6495t0;
import com.bugsnag.android.InterfaceC6498v;
import com.bugsnag.android.Q;
import com.bugsnag.android.U;
import com.bugsnag.android.Y0;
import com.bugsnag.android.b1;
import java.io.File;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/u;", "config", "", "buildUuid", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "appInfo", "Lkotlin/Lazy;", "Ljava/io/File;", "persistenceDir", "LQ6/f;", "a", "(Lcom/bugsnag/android/u;Ljava/lang/String;Landroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Lkotlin/Lazy;)LQ6/f;", "Landroid/content/Context;", "appContext", "configuration", "Lcom/bugsnag/android/v;", "connectivity", "c", "(Landroid/content/Context;Lcom/bugsnag/android/u;Lcom/bugsnag/android/v;)LQ6/f;", "b", "(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;", "bugsnag-android-core_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class g {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 4, 2})
    static final class a extends Lambda implements Function0<File> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6496u f29884f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f29885g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6496u c6496u, Context context) {
            super(0);
            this.f29884f = c6496u;
            this.f29885g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileV = this.f29884f.v();
            return fileV != null ? fileV : this.f29885g.getCacheDir();
        }
    }

    private static final String b(ApplicationInfo applicationInfo) {
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        if (bundle == null || !bundle.containsKey("com.bugsnag.android.BUILD_UUID")) {
            return null;
        }
        String string = bundle.getString("com.bugsnag.android.BUILD_UUID");
        return string != null ? string : String.valueOf(bundle.getInt("com.bugsnag.android.BUILD_UUID"));
    }

    @JvmOverloads
    public static final ImmutableConfig a(C6496u c6496u, String str, PackageInfo packageInfo, ApplicationInfo applicationInfo, Lazy<? extends File> lazy) {
        U u10;
        Set setO1;
        if (c6496u.d()) {
            u10 = c6496u.j().a();
        } else {
            u10 = new U(false);
        }
        U u11 = u10;
        String strA = c6496u.a();
        Intrinsics.f(strA, "config.apiKey");
        boolean zD = c6496u.d();
        boolean zE = c6496u.e();
        b1 b1VarB = c6496u.B();
        Intrinsics.f(b1VarB, "config.sendThreads");
        Set<String> setH = c6496u.h();
        Intrinsics.f(setH, "config.discardClasses");
        Set setO12 = CollectionsKt.o1(setH);
        Set<String> setK = c6496u.k();
        Set setO13 = null;
        if (setK != null) {
            setO1 = CollectionsKt.o1(setK);
        } else {
            setO1 = null;
        }
        Set set = setO1;
        Set<String> setX = c6496u.x();
        Intrinsics.f(setX, "config.projectPackages");
        Set setO14 = CollectionsKt.o1(setX);
        String strZ = c6496u.z();
        String strC = c6496u.c();
        Integer numE = c6496u.E();
        String strB = c6496u.b();
        D dG = c6496u.g();
        Intrinsics.f(dG, "config.delivery");
        Q qL = c6496u.l();
        Intrinsics.f(qL, "config.endpoints");
        boolean zU = c6496u.u();
        long jM = c6496u.m();
        InterfaceC6495t0 interfaceC6495t0N = c6496u.n();
        if (interfaceC6495t0N == null) {
            Intrinsics.t();
        }
        Intrinsics.f(interfaceC6495t0N, "config.logger!!");
        int iO = c6496u.o();
        int iP = c6496u.p();
        int iQ = c6496u.q();
        int iR = c6496u.r();
        Set<BreadcrumbType> setI = c6496u.i();
        if (setI != null) {
            setO13 = CollectionsKt.o1(setI);
        }
        Set<Y0> setC = c6496u.C();
        Intrinsics.f(setC, "config.telemetry");
        Set setO15 = CollectionsKt.o1(setC);
        boolean zA = c6496u.A();
        boolean zF = c6496u.F();
        Set<String> setY = c6496u.y();
        Intrinsics.f(setY, "config.redactedKeys");
        return new ImmutableConfig(strA, zD, u11, zE, b1VarB, setO12, set, setO14, setO13, setO15, strZ, str, strC, numE, strB, dG, qL, zU, jM, interfaceC6495t0N, iO, iP, iQ, iR, lazy, zA, zF, packageInfo, applicationInfo, CollectionsKt.o1(setY));
    }

    public static final ImmutableConfig c(Context context, C6496u c6496u, InterfaceC6498v interfaceC6498v) {
        Object objB;
        Object objB2;
        Integer numE;
        String str;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(packageManager.getPackageInfo(packageName, 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Integer numValueOf = null;
        if (Result.g(objB)) {
            objB = null;
        }
        PackageInfo packageInfo = (PackageInfo) objB;
        try {
            objB2 = Result.b(packageManager.getApplicationInfo(packageName, 128));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objB2 = Result.b(ResultKt.a(th3));
        }
        if (Result.g(objB2)) {
            objB2 = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) objB2;
        if (c6496u.z() == null) {
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                str = "production";
            } else {
                str = "development";
            }
            c6496u.b0(str);
        }
        if (c6496u.n() == null || Intrinsics.e(c6496u.n(), B.f63051a)) {
            if (!Intrinsics.e("production", c6496u.z())) {
                c6496u.T(B.f63051a);
            } else {
                c6496u.T(A0.f63048a);
            }
        }
        if (c6496u.E() == null || ((numE = c6496u.E()) != null && numE.intValue() == 0)) {
            if (packageInfo != null) {
                numValueOf = Integer.valueOf(packageInfo.versionCode);
            }
            c6496u.e0(numValueOf);
        }
        if (c6496u.x().isEmpty()) {
            Intrinsics.f(packageName, "packageName");
            c6496u.Z(SetsKt.d(packageName));
        }
        String strB = b(applicationInfo);
        if (c6496u.g() == null) {
            String strA = c6496u.a();
            Intrinsics.f(strA, "configuration.apiKey");
            int iS = c6496u.s();
            InterfaceC6495t0 interfaceC6495t0N = c6496u.n();
            if (interfaceC6495t0N == null) {
                Intrinsics.t();
            }
            Intrinsics.f(interfaceC6495t0N, "configuration.logger!!");
            c6496u.O(new C(interfaceC6498v, strA, iS, interfaceC6495t0N));
        }
        return a(c6496u, strB, packageInfo, applicationInfo, LazyKt.b(new a(c6496u, context)));
    }
}
