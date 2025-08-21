package g5;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.medallia.digital.mobilesdk.q2;
import d5.C13617a;
import d5.EnumC13623g;
import d5.t;
import g5.i;
import gw.w;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import m5.C15673l;
import r5.C16846j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg5/a;", "Lg5/i;", "Landroid/net/Uri;", "data", "Lm5/l;", "options", "<init>", "(Landroid/net/Uri;Lm5/l;)V", "Lg5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "b", "Lm5/l;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14327a implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uri data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15673l options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg5/a$a;", "Lg5/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "Lm5/l;", "options", "La5/h;", "imageLoader", "Lg5/i;", "b", "(Landroid/net/Uri;Lm5/l;La5/h;)Lg5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g5.a$a, reason: collision with other inner class name */
    public static final class C2117a implements i.a<Uri> {
        @Override // g5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri data, C15673l options, a5.h imageLoader) {
            if (!C16846j.r(data)) {
                return null;
            }
            return new C14327a(data, options);
        }
    }

    @Override // g5.i
    public Object a(Continuation<? super h> continuation) {
        String strB0 = CollectionsKt.B0(CollectionsKt.j0(this.data.getPathSegments(), 1), q2.f93563c, null, null, 0, null, null, 62, null);
        return new m(t.f(w.c(w.i(this.options.getContext().getAssets().open(strB0))), this.options.getContext(), new C13617a(strB0)), C16846j.k(MimeTypeMap.getSingleton(), strB0), EnumC13623g.f128047c);
    }

    public C14327a(Uri uri, C15673l c15673l) {
        this.data = uri;
        this.options = c15673l;
    }
}
