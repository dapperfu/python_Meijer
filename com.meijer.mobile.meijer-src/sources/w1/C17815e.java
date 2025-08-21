package w1;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lw1/e;", "Lw1/b;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "offset", "f", "(I)I", "e", "a", "Ljava/lang/CharSequence;", "Ljava/text/BreakIterator;", "kotlin.jvm.PlatformType", "b", "Ljava/text/BreakIterator;", "breakIterator", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17815e extends AbstractC17812b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BreakIterator breakIterator;

    @Override // w1.AbstractC17812b
    public int e(int offset) {
        return this.breakIterator.following(offset);
    }

    @Override // w1.AbstractC17812b
    public int f(int offset) {
        return this.breakIterator.preceding(offset);
    }

    public C17815e(CharSequence charSequence) {
        this.text = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.breakIterator = characterInstance;
    }
}
