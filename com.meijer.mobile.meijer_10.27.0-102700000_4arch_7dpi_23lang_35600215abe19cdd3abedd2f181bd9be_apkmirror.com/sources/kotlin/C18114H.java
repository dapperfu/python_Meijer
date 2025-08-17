package kotlin;

import android.graphics.Typeface;
import kotlin.InterfaceC18130Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly1/H;", "", "<init>", "()V", "Ly1/W;", "typefaceRequest", "Ly1/I;", "platformFontLoader", "Lkotlin/Function1;", "Ly1/Y$b;", "", "onAsyncCompletion", "createDefaultTypeface", "Ly1/Y;", "a", "(Ly1/W;Ly1/I;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly1/Y;", "Ly1/K;", "Ly1/K;", "platformTypefaceResolver", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18114H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18117K platformTypefaceResolver = C18121O.a();

    public InterfaceC18130Y a(TypefaceRequest typefaceRequest, InterfaceC18115I platformFontLoader, Function1<? super InterfaceC18130Y.b, Unit> onAsyncCompletion, Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        boolean z10;
        Typeface typefaceA;
        AbstractC18142l fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null) {
            z10 = true;
        } else {
            z10 = fontFamily instanceof C18139i;
        }
        if (z10) {
            typefaceA = this.platformTypefaceResolver.b(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else if (fontFamily instanceof C18112F) {
            typefaceA = this.platformTypefaceResolver.a((C18112F) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            InterfaceC18124S typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            Intrinsics.h(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceA = ((C1.k) typeface).a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle(), typefaceRequest.getFontSynthesis());
        }
        return new InterfaceC18130Y.b(typefaceA, false, 2, null);
    }
}
