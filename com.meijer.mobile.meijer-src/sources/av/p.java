package av;

/* loaded from: classes10.dex */
public final class p {
    public static int a(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }
}
