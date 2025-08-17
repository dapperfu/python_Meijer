package kotlin;

import android.graphics.Typeface;
import kotlin.C18153w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ly1/M;", "Ly1/K;", "<init>", "()V", "", "genericFontFamily", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Landroid/graphics/Typeface;", "c", "(Ljava/lang/String;Ly1/B;I)Landroid/graphics/Typeface;", "b", "(Ly1/B;I)Landroid/graphics/Typeface;", "Ly1/F;", "name", "a", "(Ly1/F;Ly1/B;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C18119M implements InterfaceC18117K {
    @Override // kotlin.InterfaceC18117K
    public Typeface b(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }

    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        C18153w.Companion companion = C18153w.INSTANCE;
        if (C18153w.f(fontStyle, companion.b()) && Intrinsics.e(fontWeight, FontWeight.INSTANCE.e()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(genericFontFamily == null ? Typeface.DEFAULT : Typeface.create(genericFontFamily, 0), fontWeight.getWeight(), C18153w.f(fontStyle, companion.a()));
    }

    @Override // kotlin.InterfaceC18117K
    public Typeface a(C18112F name, FontWeight fontWeight, int fontStyle) {
        return c(name.getName(), fontWeight, fontStyle);
    }
}
