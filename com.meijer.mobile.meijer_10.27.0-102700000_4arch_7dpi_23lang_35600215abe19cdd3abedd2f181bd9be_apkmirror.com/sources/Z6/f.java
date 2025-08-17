package Z6;

import Z6.d;
import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public final class f extends d {

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f42410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42411b;

        a(Context context, String str) {
            this.f42410a = context;
            this.f42411b = str;
        }

        @Override // Z6.d.a
        public File a() {
            File cacheDir = this.f42410a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f42411b != null ? new File(cacheDir, this.f42411b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
