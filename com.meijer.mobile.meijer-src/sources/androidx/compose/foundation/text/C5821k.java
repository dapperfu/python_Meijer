package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5821k extends Lambda implements Function2<Composer, Integer, String> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M f49812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5821k(M m10) {
        super(2);
        this.f49812f = m10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Composer composer, Integer num) {
        return a(composer, num.intValue());
    }

    public final String a(Composer composer, int i10) {
        composer.startReplaceGroup(-1744780674);
        if (ComposerKt.M()) {
            ComposerKt.U(-1744780674, i10, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:143)");
        }
        String strB = this.f49812f.b(composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return strB;
    }
}
