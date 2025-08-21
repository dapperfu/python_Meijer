package kotlin;

import kotlin.InterfaceC15872e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "LD0/c;", "Ln0/e$a;", "", "itemIndex", "b", "(LD0/c;I)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15873f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(D0.c<InterfaceC15872e.a<T>> cVar, int i10) {
        int size = cVar.getSize() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = ((size - i11) / 2) + i11;
            int startIndex = cVar.content[i12].getStartIndex();
            if (startIndex != i10) {
                if (startIndex < i10) {
                    i11 = i12 + 1;
                    if (i10 < cVar.content[i11].getStartIndex()) {
                    }
                } else {
                    size = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }
}
