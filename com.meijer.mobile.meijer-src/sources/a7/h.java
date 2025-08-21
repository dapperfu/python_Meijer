package a7;

/* loaded from: classes4.dex */
public final class h implements InterfaceC5664a<int[]> {
    @Override // a7.InterfaceC5664a
    public int b() {
        return 4;
    }

    @Override // a7.InterfaceC5664a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // a7.InterfaceC5664a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // a7.InterfaceC5664a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
