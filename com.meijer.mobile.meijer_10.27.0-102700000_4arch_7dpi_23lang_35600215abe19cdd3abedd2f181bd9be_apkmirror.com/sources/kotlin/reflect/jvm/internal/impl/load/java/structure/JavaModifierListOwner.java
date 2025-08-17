package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* loaded from: classes13.dex */
public interface JavaModifierListOwner extends JavaElement {
    boolean g();

    Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();
}
