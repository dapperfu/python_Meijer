package e8;

import android.content.Context;
import android.content.pm.PackageManager;
import com.medallia.digital.mobilesdk.q2;
import g8.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import v7.C17516a;
import x8.f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\bR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 ¨\u0006\""}, d2 = {"Le8/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "h", "(Landroid/content/Context;)Z", "", "", "packages", "f", "(Ljava/util/List;Landroid/content/Context;)Z", "c", "()Z", "directories", "fileName", "a", "(Ljava/util/List;Ljava/lang/String;)Z", "g", "e", "()Ljava/util/List;", "d", "b", "Ljava/lang/String;", "LOG_TAG", "Ljava/util/List;", "knownRootAppsPackages", "knownDangerousAppsPackages", "knownRootCloakingPackages", "suPaths", "Ljava/lang/Boolean;", "cachedIsRooted", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13635c {

    /* renamed from: a, reason: collision with root package name */
    public static final C13635c f128641a = new C13635c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String LOG_TAG = x.f133195a + "RootDetector";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<String> knownRootAppsPackages = CollectionsKt.p("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List<String> knownDangerousAppsPackages = CollectionsKt.p("com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_");

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final List<String> knownRootCloakingPackages = CollectionsKt.p("com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot");

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final List<String> suPaths = CollectionsKt.p("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/");

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static Boolean cachedIsRooted;

    private final boolean c() throws Throwable {
        Process processExec;
        Process process = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
            Intrinsics.g(processExec);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean z10 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z10;
        } catch (Exception unused2) {
            process = processExec;
            if (process != null) {
                process.destroy();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            process = processExec;
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    public final boolean b(Context context) {
        Intrinsics.j(context, "context");
        return f(knownRootAppsPackages, context) || f(knownRootCloakingPackages, context) || f(knownDangerousAppsPackages, context);
    }

    public final boolean d() {
        String strA = C17516a.f164588a.a();
        boolean zC0 = strA != null ? StringsKt.c0(strA, "test-keys", false, 2, null) : false;
        if (zC0 && x.f133196b) {
            f.u(LOG_TAG, "test-keys detected");
        }
        return zC0;
    }

    public final List<String> e() {
        List<String> listM1 = CollectionsKt.m1(suPaths);
        String str = System.getenv("PATH");
        if (str == null || str.length() == 0) {
            return listM1;
        }
        List listA1 = StringsKt.a1(str, new String[]{":"}, false, 0, 6, null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listA1) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        for (String str2 : arrayList) {
            if (!StringsKt.G(str2, q2.f92724c, false, 2, null)) {
                str2 = str2 + '/';
            }
            if (!listM1.contains(str2)) {
                listM1.add(str2);
            }
        }
        return listM1;
    }

    public final boolean g(Context context) {
        Intrinsics.j(context, "context");
        if (cachedIsRooted == null) {
            cachedIsRooted = Boolean.valueOf(h(context));
        }
        Boolean bool = cachedIsRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private C13635c() {
    }

    private final boolean a(List<String> directories, String fileName) {
        Iterator<String> it = directories.iterator();
        while (it.hasNext()) {
            File file = new File(it.next(), fileName);
            if (file.exists()) {
                if (x.f133196b) {
                    f.u(LOG_TAG, "file detected: " + file);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    private final boolean f(List<String> packages, Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        List<String> list = packages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                if (x.f133196b) {
                    f.u(LOG_TAG, "detected package: " + str);
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    private final boolean h(Context context) {
        if (!d() && !b(context)) {
            List<String> listE = e();
            if (!a(listE, "su") && !a(listE, "busybox") && !a(listE, "magisk")) {
                if (c()) {
                    if (x.f133196b) {
                        f.u(LOG_TAG, "su command detected");
                    }
                    return true;
                }
                return false;
            }
            if (x.f133196b) {
                f.u(LOG_TAG, "suspicious file detected");
            }
        }
        return true;
    }
}
