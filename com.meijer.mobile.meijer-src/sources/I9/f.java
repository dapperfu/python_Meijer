package I9;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0006*\u00020\rH\u0012¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\tJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LI9/f;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "path", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/File;", "b", "()Ljava/io/File;", "Ljava/io/BufferedReader;", "j", "(Ljava/io/BufferedReader;)Ljava/lang/String;", "", "retryCount", "e", "(Ljava/lang/String;I)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)V", "fileUrl", "i", "url", "k", "Ljava/io/InputStream;", "h", "(Ljava/lang/String;)Ljava/io/InputStream;", "a", "Landroid/content/Context;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14388b = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LI9/f$a;", "", "<init>", "()V", "", "BUFFER_SIZE", "I", "", "DELAY_TIME", "J", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
    }

    private File b() throws IOException {
        File cacheDir = this.context.getCacheDir();
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "toString(...)");
        File file = new File(cacheDir, string);
        file.createNewFile();
        return file;
    }

    public static /* synthetic */ String f(f fVar, String str, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return fVar.e(str, i10);
    }

    private String j(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                sb2.deleteCharAt(sb2.length() - 1);
                String string = sb2.toString();
                Intrinsics.i(string, "toString(...)");
                return string;
            }
            sb2.append(line);
            sb2.append(property);
        }
    }

    public void c(String path) {
        Intrinsics.j(path, "path");
        File file = new File(path);
        if (file.exists()) {
            file.delete();
            return;
        }
        throw new IllegalArgumentException(("File " + path + " does not exists.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String e(final String path, int retryCount) throws InterruptedException {
        Intrinsics.j(path, "path");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (URLUtil.isHttpsUrl(path)) {
            l.f14392a.a(retryCount, 3000L, new Function0() { // from class: I9.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.g(objectRef, this, path);
                }
            });
        }
        return (String) objectRef.f143742a;
    }

    public InputStream h(String path) throws IOException {
        Intrinsics.j(path, "path");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(path).openConnection()));
            Intrinsics.h(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return null;
        }
    }

    public String i(String fileUrl) {
        Intrinsics.j(fileUrl, "fileUrl");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileUrl));
        try {
            String strJ = j(bufferedReader);
            CloseableKt.a(bufferedReader, null);
            return strJ;
        } finally {
        }
    }

    public String k(String url) throws IOException {
        String strJ;
        Intrinsics.j(url, "url");
        InputStream inputStreamH = h(url);
        BufferedReader bufferedReader = inputStreamH != null ? new BufferedReader(new InputStreamReader(inputStreamH, Charsets.UTF_8), 8192) : null;
        if (bufferedReader != null) {
            try {
                strJ = j(bufferedReader);
            } finally {
            }
        } else {
            strJ = null;
        }
        CloseableKt.a(bufferedReader, null);
        return strJ;
    }

    private String d(String path) throws IOException {
        String path2;
        File fileB = b();
        InputStream inputStreamH = h(path);
        if (inputStreamH != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileB, false);
                try {
                    byte[] bArr = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
                    while (true) {
                        int i10 = inputStreamH.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                    Unit unit = Unit.f143329a;
                    CloseableKt.a(fileOutputStream, null);
                    path2 = fileB.toURI().toURL().getPath();
                } finally {
                }
            } finally {
            }
        } else {
            path2 = null;
        }
        CloseableKt.a(inputStreamH, null);
        return path2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public static final Unit g(Ref.ObjectRef objectRef, f fVar, String str) {
        objectRef.f143742a = fVar.d(str);
        return Unit.f143329a;
    }
}
