package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class ValueClassRepresentation<Type extends RigidTypeMarker> {
    public /* synthetic */ ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(Name name);

    private ValueClassRepresentation() {
    }

    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> b(Function1<? super Type, ? extends Other> transform) {
        Intrinsics.j(transform, "transform");
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.c(), transform.invoke(inlineClassRepresentation.d()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<Name, Type>> listC = ((MultiFieldValueClassRepresentation) this).c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(TuplesKt.a((Name) pair.a(), transform.invoke((RigidTypeMarker) pair.b())));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
