package hf;

/* loaded from: classes8.dex */
final class g {
    static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
