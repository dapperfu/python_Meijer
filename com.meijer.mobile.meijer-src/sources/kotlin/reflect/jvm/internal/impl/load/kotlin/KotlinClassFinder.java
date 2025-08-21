package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* loaded from: classes14.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    public static abstract class Result {

        public static final class ClassFileContent extends Result {

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f145725a;

            public final byte[] b() {
                return this.f145725a;
            }
        }

        public static final class KotlinClass extends Result {

            /* renamed from: a, reason: collision with root package name */
            private final KotlinJvmBinaryClass f145726a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f145727b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                Intrinsics.j(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f145726a = kotlinJvmBinaryClass;
                this.f145727b = bArr;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i10 & 2) != 0 ? null : bArr);
            }

            public final KotlinJvmBinaryClass b() {
                return this.f145726a;
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        public final KotlinJvmBinaryClass a() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.b();
            }
            return null;
        }
    }

    Result a(ClassId classId, MetadataVersion metadataVersion);

    Result c(JavaClass javaClass, MetadataVersion metadataVersion);
}
