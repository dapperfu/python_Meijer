package z1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "high", "low", "", "b", "(CC)Z", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18364j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c10, char c11) {
        if (Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11)) {
            return true;
        }
        return false;
    }
}
