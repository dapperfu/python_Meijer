package R6;

import S6.ValueProvider;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.C6583a0;
import com.bugsnag.android.C6627x;
import com.bugsnag.android.D0;
import com.bugsnag.android.E;
import com.bugsnag.android.F;
import com.bugsnag.android.H;
import com.bugsnag.android.InterfaceC6629y;
import com.bugsnag.android.L0;
import com.bugsnag.android.X;
import com.bugsnag.android.m1;
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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/bugsnag/android/x;", "config", "LS6/d;", "", "buildUuid", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "appInfo", "Lkotlin/Lazy;", "Ljava/io/File;", "persistenceDir", "LR6/k;", "b", "(Lcom/bugsnag/android/x;LS6/d;Landroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Lkotlin/Lazy;)LR6/k;", "value", "", "e", "(Ljava/lang/String;)V", "apiKey", "", "c", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "appContext", "configuration", "Lcom/bugsnag/android/y;", "connectivity", "LR6/b;", "backgroundTaskService", "d", "(Landroid/content/Context;Lcom/bugsnag/android/x;Lcom/bugsnag/android/y;LR6/b;)LR6/k;", "a", "(Landroid/content/pm/ApplicationInfo;LR6/b;)LS6/d;", "bugsnag-android-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class l {

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"R6/l$a", "LS6/e;", "f", "()Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends S6.e<String> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ApplicationInfo f32012e;

        public a(ApplicationInfo applicationInfo) {
            this.f32012e = applicationInfo;
        }

        @Override // S6.e
        public String f() {
            return h.f31965a.c(this.f32012e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function0<File> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6627x f32013f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f32014g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6627x c6627x, Context context) {
            super(0);
            this.f32013f = c6627x;
            this.f32014g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileW = this.f32013f.w();
            return fileW == null ? this.f32014g.getCacheDir() : fileW;
        }
    }

    private static final S6.d<String> a(ApplicationInfo applicationInfo, R6.b bVar) {
        Bundle bundle = applicationInfo == null ? null : applicationInfo.metaData;
        if (bundle != null && bundle.containsKey("com.bugsnag.android.BUILD_UUID")) {
            String string = bundle.getString("com.bugsnag.android.BUILD_UUID");
            if (string == null) {
                string = String.valueOf(bundle.getInt("com.bugsnag.android.BUILD_UUID"));
            }
            return new ValueProvider(string.length() > 0 ? string : null);
        }
        if (applicationInfo == null) {
            return null;
        }
        t tVar = t.IO;
        a aVar = new a(applicationInfo);
        bVar.b(tVar, aVar);
        return aVar;
    }

    public static final boolean c(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("No Bugsnag API Key set");
        }
        if (str.length() != 32) {
            return true;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                z10 = true;
                break;
            }
            char cCharAt = str.charAt(i10);
            i10++;
            if (!Character.isDigit(cCharAt) && ('a' > cCharAt || cCharAt >= 'g')) {
                break;
            }
        }
        return !z10;
    }

    @JvmOverloads
    public static final ImmutableConfig b(C6627x c6627x, S6.d<String> dVar, PackageInfo packageInfo, ApplicationInfo applicationInfo, Lazy<? extends File> lazy) {
        C6583a0 c6583a0;
        Set setO1;
        if (c6627x.d()) {
            c6583a0 = c6627x.j().a();
        } else {
            c6583a0 = new C6583a0(false);
        }
        C6583a0 c6583a02 = c6583a0;
        String strA = c6627x.a();
        boolean zD = c6627x.d();
        boolean zE = c6627x.e();
        m1 m1VarC = c6627x.C();
        Set setO12 = CollectionsKt.o1(c6627x.h());
        Set<String> setK = c6627x.k();
        Set setO13 = null;
        if (setK == null) {
            setO1 = null;
        } else {
            setO1 = CollectionsKt.o1(setK);
        }
        Set setO14 = CollectionsKt.o1(c6627x.y());
        String strA2 = c6627x.A();
        String strC = c6627x.c();
        Integer numG = c6627x.G();
        String strB = c6627x.b();
        H hG = c6627x.g();
        X xL = c6627x.l();
        boolean zV = c6627x.v();
        boolean zM = c6627x.m();
        long jN = c6627x.n();
        D0 d0O = c6627x.o();
        Intrinsics.g(d0O);
        int iP = c6627x.p();
        int iQ = c6627x.q();
        int iR = c6627x.r();
        int iS = c6627x.s();
        int iT = c6627x.t();
        long jE = c6627x.E();
        Set<BreadcrumbType> setI = c6627x.i();
        if (setI != null) {
            setO13 = CollectionsKt.o1(setI);
        }
        return new ImmutableConfig(strA, zD, c6583a02, zE, m1VarC, setO12, setO1, setO14, setO13, CollectionsKt.o1(c6627x.D()), strA2, dVar, strC, numG, strB, hG, xL, zV, jN, d0O, iP, iQ, iR, iS, iT, jE, lazy, c6627x.B(), c6627x.H(), zM, packageInfo, applicationInfo, CollectionsKt.o1(c6627x.z()));
    }

    public static final ImmutableConfig d(Context context, C6627x c6627x, InterfaceC6629y interfaceC6629y, R6.b bVar) {
        Object objB;
        Object objB2;
        Integer numG;
        String str;
        e(c6627x.a());
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
        if (c6627x.A() == null) {
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                str = "production";
            } else {
                str = "development";
            }
            c6627x.d0(str);
        }
        if (c6627x.o() == null || Intrinsics.e(c6627x.o(), E.f63902a)) {
            if (!Intrinsics.e("production", c6627x.A())) {
                c6627x.V(E.f63902a);
            } else {
                c6627x.V(L0.f63946a);
            }
        }
        if (c6627x.G() == null || ((numG = c6627x.G()) != null && numG.intValue() == 0)) {
            if (packageInfo != null) {
                numValueOf = Integer.valueOf(packageInfo.versionCode);
            }
            c6627x.h0(numValueOf);
        }
        if (c6627x.y().isEmpty()) {
            c6627x.b0(SetsKt.d(packageName));
        }
        S6.d<String> dVarA = a(applicationInfo, bVar);
        if (c6627x.g() == null) {
            D0 d0O = c6627x.o();
            Intrinsics.g(d0O);
            c6627x.P(new F(interfaceC6629y, d0O));
        }
        return b(c6627x, dVarA, packageInfo, applicationInfo, LazyKt.b(new b(c6627x, context)));
    }

    private static final void e(String str) {
        if (c(str)) {
            E.f63902a.g(Intrinsics.q("Invalid configuration. apiKey should be a 32-character hexademical string, got ", str));
        }
    }
}
