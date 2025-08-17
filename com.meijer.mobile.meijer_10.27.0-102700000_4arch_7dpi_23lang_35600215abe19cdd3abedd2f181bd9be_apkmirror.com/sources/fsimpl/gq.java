package fsimpl;

/* loaded from: classes14.dex */
class gq extends IllegalArgumentException {
    gq(int i10, int i11) {
        super("Unpaired surrogate at index " + i10 + " of " + i11);
    }
}
