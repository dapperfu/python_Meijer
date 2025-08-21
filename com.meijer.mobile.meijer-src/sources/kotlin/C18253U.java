package kotlin;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly1/U;", "", "<init>", "()V", "Ly1/A;", "Landroid/content/Context;", "context", "", "b", "(Ly1/A;Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "a", "(Landroid/graphics/Typeface;Ly1/A;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C18253U {

    /* renamed from: a, reason: collision with root package name */
    public static final C18253U f171078a = new C18253U();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly1/z;", "setting", "", "a", "(Ly1/z;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y1.U$a */
    static final class a extends Lambda implements Function1<InterfaceC18283z, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H1.d f171080f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H1.d dVar) {
            super(1);
            this.f171080f = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC18283z interfaceC18283z) {
            return '\'' + interfaceC18283z.c() + "' " + interfaceC18283z.b(this.f171080f);
        }
    }

    public final Typeface a(Typeface typeface, C18234A variationSettings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.a().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(variationSettings, context));
        return paint.getTypeface();
    }

    private C18253U() {
    }

    private final String b(C18234A c18234a, Context context) {
        return J1.a.e(c18234a.a(), null, null, null, 0, null, new a(H1.a.a(context)), 31, null);
    }
}
