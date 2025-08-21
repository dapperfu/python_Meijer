package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public interface JavaCallableMemberDescriptor extends CallableMemberDescriptor {
    JavaCallableMemberDescriptor Y(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, Pair<CallableDescriptor.UserDataKey<?>, ?> pair);
}
