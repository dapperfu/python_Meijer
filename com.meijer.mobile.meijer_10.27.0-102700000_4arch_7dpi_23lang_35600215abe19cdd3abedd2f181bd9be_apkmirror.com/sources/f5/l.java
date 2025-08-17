package f5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import c5.EnumC6361g;
import c5.t;
import c5.u;
import f5.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.w;
import l5.C15376l;
import q5.C16452d;
import q5.C16458j;
import q5.C16461m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\t\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lf5/l;", "Lf5/i;", "Landroid/net/Uri;", "data", "Ll5/l;", "options", "<init>", "(Landroid/net/Uri;Ll5/l;)V", "", "b", "(Landroid/net/Uri;)Ljava/lang/Void;", "Lf5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "Ll5/l;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uri data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15376l options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf5/l$b;", "Lf5/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "c", "(Landroid/net/Uri;)Z", "Ll5/l;", "options", "LZ4/h;", "imageLoader", "Lf5/i;", "b", "(Landroid/net/Uri;Ll5/l;LZ4/h;)Lf5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.a<Uri> {
        private final boolean c(Uri data) {
            return Intrinsics.e(data.getScheme(), "android.resource");
        }

        @Override // f5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri data, C15376l options, Z4.h imageLoader) {
            if (!c(data)) {
                return null;
            }
            return new l(data, options);
        }
    }

    private final Void b(Uri data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }

    @Override // f5.i
    public Object a(Continuation<? super h> continuation) throws Resources.NotFoundException {
        Integer numV;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (StringsKt.r0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.F0(this.data.getPathSegments());
                if (str == null || (numV = StringsKt.v(str)) == null) {
                    b(this.data);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numV.intValue();
                Context context = this.options.getContext();
                Resources resources = Intrinsics.e(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strK = C16458j.k(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.v0(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!Intrinsics.e(strK, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(t.f(w.d(w.k(resources.openRawResource(iIntValue, typedValue2))), context, new u(authority, iIntValue, typedValue2.density)), strK, EnumC6361g.f61480c);
                }
                Drawable drawableA = Intrinsics.e(authority, context.getPackageName()) ? C16452d.a(context, iIntValue) : C16452d.d(context, resources, iIntValue);
                boolean zV = C16458j.v(drawableA);
                if (zV) {
                    drawableA = new BitmapDrawable(context.getResources(), C16461m.f156792a.a(drawableA, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
                }
                return new g(drawableA, zV, EnumC6361g.f61480c);
            }
        }
        b(this.data);
        throw new KotlinNothingValueException();
    }

    public l(Uri uri, C15376l c15376l) {
        this.data = uri;
        this.options = c15376l;
    }
}
