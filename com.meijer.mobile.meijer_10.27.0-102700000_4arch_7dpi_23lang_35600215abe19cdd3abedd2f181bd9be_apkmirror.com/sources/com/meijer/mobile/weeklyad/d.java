package com.meijer.mobile.weeklyad;

import Ta.a;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0015¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/weeklyad/d;", "LTa/a;", "LTa/a$b;", "storefrontLoadListener", "", "url", "<init>", "(LTa/a$b;Ljava/lang/String;)V", "", "Ljava/lang/Void;", "voids", "LTa/a$a;", "a", "([Ljava/lang/Void;)LTa/a$a;", "c", "Ljava/lang/String;", "sfmlUrl", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends Ta.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f119293e = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String sfmlUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.b bVar, String url) {
        super(bVar);
        Intrinsics.j(url, "url");
        this.sfmlUrl = url;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    @Deprecated
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a.C0776a doInBackground(Void... voids) {
        Intrinsics.j(voids, "voids");
        a.C0776a c0776a = new a.C0776a();
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(this.sfmlUrl).openConnection()));
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            InputStream gZIPInputStream = Intrinsics.e("gzip", uRLConnection.getContentEncoding()) ? new GZIPInputStream(uRLConnection.getInputStream()) : uRLConnection.getInputStream();
            Intrinsics.g(gZIPInputStream);
            c(gZIPInputStream);
            a.C0776a c0776aDoInBackground = super.doInBackground((Void[]) Arrays.copyOf(voids, voids.length));
            Intrinsics.i(c0776aDoInBackground, "doInBackground(...)");
            return c0776aDoInBackground;
        } catch (Exception e10) {
            c0776a.f(e10);
            e10.printStackTrace();
            return c0776a;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
