package c7;

import android.content.Context;
import android.net.Uri;
import b7.o;
import b7.p;
import b7.s;
import java.io.InputStream;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6373b implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f61619a;

    /* renamed from: c7.b$a */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f61620a;

        @Override // b7.p
        public o<Uri, InputStream> d(s sVar) {
            return new C6373b(this.f61620a);
        }

        public a(Context context) {
            this.f61620a = context;
        }
    }

    public C6373b(Context context) {
        this.f61619a = context.getApplicationContext();
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, V6.g gVar) {
        if (W6.b.e(i10, i11)) {
            return new o.a<>(new o7.d(uri), W6.c.f(this.f61619a, uri));
        }
        return null;
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return W6.b.b(uri);
    }
}
