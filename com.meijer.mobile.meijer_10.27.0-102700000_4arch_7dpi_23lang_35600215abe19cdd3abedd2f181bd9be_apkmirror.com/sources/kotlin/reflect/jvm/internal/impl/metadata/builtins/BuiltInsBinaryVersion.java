package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* loaded from: classes13.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f145476g = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final BuiltInsBinaryVersion f145477h = new BuiltInsBinaryVersion(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final BuiltInsBinaryVersion f145478i = new BuiltInsBinaryVersion(new int[0]);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BuiltInsBinaryVersion a(InputStream stream) {
            Intrinsics.j(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(CollectionsKt.x(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrI1 = CollectionsKt.i1(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrI1, iArrI1.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.j(numbers, "numbers");
    }

    public boolean h() {
        return f(f145477h);
    }
}
