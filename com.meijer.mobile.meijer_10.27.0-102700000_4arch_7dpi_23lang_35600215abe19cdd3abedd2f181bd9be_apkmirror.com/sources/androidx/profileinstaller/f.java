package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.privacysandbox.ads.adservices.measurement.k;
import com.fullstory.FS;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final c f57815a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final c f57816b = new b();

    public interface c {
        void a(int i10, Object obj);

        void b(int i10, Object obj);
    }

    public static void i(Context context, Executor executor, c cVar) throws PackageManager.NameNotFoundException {
        j(context, executor, cVar, false);
    }

    class a implements c {
        @Override // androidx.profileinstaller.f.c
        public void a(int i10, Object obj) {
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i10, Object obj) {
        }

        a() {
        }
    }

    class b implements c {
        @Override // androidx.profileinstaller.f.c
        public void b(int i10, Object obj) {
            FS.log_d("ProfileInstaller", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        b() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 != 6 && i10 != 7 && i10 != 8) {
                FS.log_d("ProfileInstaller", str);
            } else {
                FS.log_e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static boolean d(PackageInfo packageInfo, File file, c cVar) throws IOException {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    cVar.a(2, null);
                }
                return z10;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    static void e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    static void f(Executor executor, final c cVar, final int i10, final Object obj) {
        executor.execute(new Runnable() { // from class: p4.b
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(i10, obj);
            }
        });
    }

    private static boolean g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) throws IOException {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zM = bVar.h().l().m();
        if (zM) {
            e(packageInfo, file);
        }
        return zM;
    }

    public static void h(Context context) throws PackageManager.NameNotFoundException {
        i(context, new k(), f57815a);
    }

    static void c(Context context, Executor executor, c cVar) {
        b(context.getFilesDir());
        f(executor, cVar, 11, null);
    }

    static void j(Context context, Executor executor, c cVar, boolean z10) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && d(packageInfo, filesDir, cVar)) {
                FS.log_d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                h.c(context, false);
                return;
            }
            FS.log_d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z10) {
                z11 = true;
            }
            h.c(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.a(7, e10);
            h.c(context, false);
        }
    }

    static void k(Context context, Executor executor, c cVar) throws PackageManager.NameNotFoundException, IOException {
        try {
            e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            f(executor, cVar, 7, e10);
        }
    }
}
