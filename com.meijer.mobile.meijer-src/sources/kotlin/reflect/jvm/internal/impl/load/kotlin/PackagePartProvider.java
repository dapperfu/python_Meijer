package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {

        /* renamed from: a, reason: collision with root package name */
        public static final Empty f145735a = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        public List<String> a(String packageFqName) {
            Intrinsics.j(packageFqName, "packageFqName");
            return CollectionsKt.m();
        }

        private Empty() {
        }
    }

    List<String> a(String str);
}
