package androidx.compose.foundation.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "index", "b", "(Ljava/lang/String;I)I", "a", "Landroidx/emoji2/text/f;", "c", "()Landroidx/emoji2/text/f;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class I {
    public static final int a(String str, int i10) {
        androidx.emoji2.text.f fVarC = c();
        Integer num = null;
        if (fVarC != null) {
            Integer numValueOf = Integer.valueOf(fVarC.d(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(String str, int i10) {
        androidx.emoji2.text.f fVarC = c();
        Integer num = null;
        if (fVarC != null) {
            Integer numValueOf = Integer.valueOf(fVarC.f(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    private static final androidx.emoji2.text.f c() {
        if (androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
            if (fVarC.g() == 1) {
                return fVarC;
            }
        }
        return null;
    }
}
