package z1;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lz1/g;", "Lz1/i;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Lz1/l;", "buffer", "", "a", "(Lz1/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getLengthBeforeCursor", "b", "getLengthAfterCursor", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: z1.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements InterfaceC18426i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lengthBeforeCursor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lengthAfterCursor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }

    public DeleteSurroundingTextCommand(int i10, int i11) {
        boolean z10;
        this.lengthBeforeCursor = i10;
        this.lengthAfterCursor = i11;
        if (i10 >= 0 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            A1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
        }
    }

    @Override // z1.InterfaceC18426i
    public void a(C18429l buffer) {
        int selectionEnd = buffer.getSelectionEnd();
        int i10 = this.lengthAfterCursor;
        int iH = selectionEnd + i10;
        if (((selectionEnd ^ iH) & (i10 ^ iH)) < 0) {
            iH = buffer.h();
        }
        buffer.b(buffer.getSelectionEnd(), Math.min(iH, buffer.h()));
        int selectionStart = buffer.getSelectionStart();
        int i11 = this.lengthBeforeCursor;
        int i12 = selectionStart - i11;
        if (((selectionStart ^ i12) & (i11 ^ selectionStart)) < 0) {
            i12 = 0;
        }
        buffer.b(Math.max(0, i12), buffer.getSelectionStart());
    }
}
