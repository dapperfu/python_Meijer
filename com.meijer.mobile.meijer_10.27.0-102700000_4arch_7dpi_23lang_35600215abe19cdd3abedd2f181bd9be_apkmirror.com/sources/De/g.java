package De;

import java.util.Objects;

/* loaded from: classes6.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<char[]> f6404a = new a();

    class a extends ThreadLocal<char[]> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }

        a() {
        }
    }

    static char[] a() {
        char[] cArr = f6404a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
