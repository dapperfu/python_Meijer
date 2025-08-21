package kotlin;

import android.graphics.Typeface;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Ly1/N;", "Ly1/K;", "<init>", "()V", "", "familyName", "Ly1/B;", "weight", "Ly1/w;", "style", "Landroid/graphics/Typeface;", "d", "(Ljava/lang/String;Ly1/B;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "c", "b", "(Ly1/B;I)Landroid/graphics/Typeface;", "Ly1/F;", "name", "a", "(Ly1/F;Ly1/B;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C18247N implements InterfaceC18244K {
    @Override // kotlin.InterfaceC18244K
    public Typeface b(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }

    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (C18280w.f(fontStyle, C18280w.INSTANCE.b()) && Intrinsics.e(fontWeight, FontWeight.INSTANCE.e()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = C18263f.c(fontWeight, fontStyle);
        return (genericFontFamily == null || genericFontFamily.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(genericFontFamily, iC);
    }

    private final Typeface d(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(familyName, weight, style);
        if (Intrinsics.e(typefaceC, FS.typefaceCreateDerived(Typeface.DEFAULT, C18263f.c(weight, style))) || Intrinsics.e(typefaceC, c(null, weight, style))) {
            return null;
        }
        return typefaceC;
    }

    @Override // kotlin.InterfaceC18244K
    public Typeface a(C18239F name, FontWeight fontWeight, int fontStyle) {
        Typeface typefaceD = d(C18248O.b(name.getName(), fontWeight), fontWeight, fontStyle);
        if (typefaceD == null) {
            return c(name.getName(), fontWeight, fontStyle);
        }
        return typefaceD;
    }
}
