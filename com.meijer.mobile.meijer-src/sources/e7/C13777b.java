package e7;

import android.content.Context;
import android.net.Uri;
import d7.o;
import d7.p;
import d7.s;
import java.io.InputStream;

/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13777b implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f130001a;

    /* renamed from: e7.b$a */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f130002a;

        @Override // d7.p
        public o<Uri, InputStream> d(s sVar) {
            return new C13777b(this.f130002a);
        }

        public a(Context context) {
            this.f130002a = context;
        }
    }

    public C13777b(Context context) {
        this.f130001a = context.getApplicationContext();
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, X6.g gVar) {
        if (Y6.b.e(i10, i11)) {
            return new o.a<>(new q7.d(uri), Y6.c.f(this.f130001a, uri));
        }
        return null;
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Y6.b.b(uri);
    }
}
