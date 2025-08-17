package Hp;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import jf.C14888a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LHp/f;", "", "Landroid/content/Context;", "application", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "Ljava/io/File;", "a", "(Landroid/net/Uri;)Ljava/io/File;", "Landroid/content/Context;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context application;

    public f(Context application) {
        Intrinsics.j(application, "application");
        this.application = application;
    }

    public final File a(Uri uri) throws IOException {
        Intrinsics.j(uri, "uri");
        try {
            InputStream inputStreamOpenInputStream = this.application.getContentResolver().openInputStream(uri);
            File fileCreateTempFile = File.createTempFile(String.valueOf(System.currentTimeMillis()), ".png", this.application.getCacheDir());
            C14888a.a(inputStreamOpenInputStream, fileCreateTempFile);
            return fileCreateTempFile;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
