package b7;

import android.content.Context;
import b7.d;
import java.io.File;

/* loaded from: classes4.dex */
public final class f extends d {

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f60077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f60078b;

        a(Context context, String str) {
            this.f60077a = context;
            this.f60078b = str;
        }

        @Override // b7.d.a
        public File a() {
            File cacheDir = this.f60077a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f60078b != null ? new File(cacheDir, this.f60078b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
