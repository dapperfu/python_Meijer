package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(ClassId classId) {
        String strP = StringsKt.P(classId.g().a(), '.', '$', false, 4, null);
        if (classId.f().c()) {
            return strP;
        }
        return classId.f() + '.' + strP;
    }
}
