package e7;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.I;
import d7.o;
import d7.p;
import d7.s;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class c implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f130003a;

    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f130004a;

        @Override // d7.p
        public o<Uri, InputStream> d(s sVar) {
            return new c(this.f130004a);
        }

        public a(Context context) {
            this.f130004a = context;
        }
    }

    private boolean e(X6.g gVar) {
        Long l10 = (Long) gVar.a(I.f64884d);
        return l10 != null && l10.longValue() == -1;
    }

    public c(Context context) {
        this.f130003a = context.getApplicationContext();
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(Uri uri, int i10, int i11, X6.g gVar) {
        if (Y6.b.e(i10, i11) && e(gVar)) {
            return new o.a<>(new q7.d(uri), Y6.c.g(this.f130003a, uri));
        }
        return null;
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Y6.b.d(uri);
    }
}
