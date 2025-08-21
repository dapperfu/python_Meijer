package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;

/* loaded from: classes14.dex */
public interface ContractDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f147275a = Companion.f147276a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f147276a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final ContractDeserializer f147277b = new ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            public Pair a(ProtoBuf.Function proto, FunctionDescriptor ownerFunction, TypeTable typeTable, TypeDeserializer typeDeserializer) {
                Intrinsics.j(proto, "proto");
                Intrinsics.j(ownerFunction, "ownerFunction");
                Intrinsics.j(typeTable, "typeTable");
                Intrinsics.j(typeDeserializer, "typeDeserializer");
                return null;
            }
        };

        public final ContractDeserializer a() {
            return f147277b;
        }

        private Companion() {
        }
    }

    Pair<CallableDescriptor.UserDataKey<?>, Object> a(ProtoBuf.Function function, FunctionDescriptor functionDescriptor, TypeTable typeTable, TypeDeserializer typeDeserializer);
}
