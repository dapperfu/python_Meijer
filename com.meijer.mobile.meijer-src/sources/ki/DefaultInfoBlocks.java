package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lki/j0;", "", "Lki/q1$i;", "errorBlock", "warningBlock", "successBlock", "informationBlock", "<init>", "(Lki/q1$i;Lki/q1$i;Lki/q1$i;Lki/q1$i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$i;", "()Lki/q1$i;", "b", "d", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.j0, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class DefaultInfoBlocks {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.InfoBlock errorBlock;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.InfoBlock warningBlock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.InfoBlock successBlock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.InfoBlock informationBlock;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultInfoBlocks)) {
            return false;
        }
        DefaultInfoBlocks defaultInfoBlocks = (DefaultInfoBlocks) other;
        return Intrinsics.e(this.errorBlock, defaultInfoBlocks.errorBlock) && Intrinsics.e(this.warningBlock, defaultInfoBlocks.warningBlock) && Intrinsics.e(this.successBlock, defaultInfoBlocks.successBlock) && Intrinsics.e(this.informationBlock, defaultInfoBlocks.informationBlock);
    }

    public DefaultInfoBlocks(q1.InfoBlock errorBlock, q1.InfoBlock warningBlock, q1.InfoBlock successBlock, q1.InfoBlock informationBlock) {
        Intrinsics.j(errorBlock, "errorBlock");
        Intrinsics.j(warningBlock, "warningBlock");
        Intrinsics.j(successBlock, "successBlock");
        Intrinsics.j(informationBlock, "informationBlock");
        this.errorBlock = errorBlock;
        this.warningBlock = warningBlock;
        this.successBlock = successBlock;
        this.informationBlock = informationBlock;
    }

    /* renamed from: a, reason: from getter */
    public final q1.InfoBlock getErrorBlock() {
        return this.errorBlock;
    }

    /* renamed from: b, reason: from getter */
    public final q1.InfoBlock getInformationBlock() {
        return this.informationBlock;
    }

    /* renamed from: c, reason: from getter */
    public final q1.InfoBlock getSuccessBlock() {
        return this.successBlock;
    }

    /* renamed from: d, reason: from getter */
    public final q1.InfoBlock getWarningBlock() {
        return this.warningBlock;
    }

    public int hashCode() {
        return (((((this.errorBlock.hashCode() * 31) + this.warningBlock.hashCode()) * 31) + this.successBlock.hashCode()) * 31) + this.informationBlock.hashCode();
    }

    public String toString() {
        return "DefaultInfoBlocks(errorBlock=" + this.errorBlock + ", warningBlock=" + this.warningBlock + ", successBlock=" + this.successBlock + ", informationBlock=" + this.informationBlock + ')';
    }
}
