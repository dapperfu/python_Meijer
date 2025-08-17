package com.fullstory.compose;

import androidx.compose.ui.Modifier;
import com.fullstory.FS;
import com.fullstory.util.Log;
import io.constructor.data.local.PreferencesHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\u001a\"\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a6\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a<\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001aJ\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001aP\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a\f\u0010\u0017\u001a\u00020\u000b*\u00020\u000bH\u0002\u001a \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007*\u00020\u000b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0002\u001ax\u0010\u001b\u001a\u00020\u000b*\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a\u0080\u0001\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007*\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a`\u0010 \u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001af\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001ah\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a\u0014\u0010#\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010$\u001a\u00020\rH\u0002\u001a4\u0010%\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a:\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001aH\u0010(\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001aN\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\u0006\u0010&\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a4\u0010*\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a:\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001aH\u0010-\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001aN\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002\u001a\u0012\u0010/\u001a\u00020\u000b*\u00020\u000b2\u0006\u00100\u001a\u00020\u000f\u001a\u001a\u00101\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f\u001a\u0014\u00104\u001a\u00020\u000b*\u00020\u000b2\u0006\u00100\u001a\u00020\u000fH\u0007\u001a\n\u00105\u001a\u00020\u000b*\u00020\u000b\u001a\n\u00106\u001a\u00020\u000b*\u00020\u000b\u001a\u0012\u00107\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\u000f\u001a\n\u00109\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010:\u001a\u00020\u000b*\u00020\u000b\u001a\u0012\u0010;\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010<\u001a\u00020\u000f\u001a\n\u0010=\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010>\u001a\u00020\u000b*\u00020\u000b\u001aL\u0010?\u001a\u00020\u000b*\u00020\u000b2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010A2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010C2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000f¨\u0006D"}, d2 = {"__consumerToFunction1", "Lkotlin/Function1;", "Ljava/lang/Object;", "", "consumer", "Ljava/util/function/Consumer;", "__runnableToFunction0", "Lkotlin/Function0;", "runnable", "Ljava/lang/Runnable;", "__clickable5_Modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "onClickLabel", "", "role", "onClick", "__clickable5_onClick", "__clickable7_Modifier", "interactionSource", "indication", "__clickable7_onClick", "__clickable_Modifier", "__clickable_onClick", "__clickable_onLongClick", "onLongClick", "__combinedClickable10_Modifier", "onLongClickLabel", "onDoubleClick", "__combinedClickable10_onClick", "__combinedClickable10_onLongClick", "__combinedClickable8_Modifier", "__combinedClickable8_onClick", "__combinedClickable8_onLongClick", "__fullstory_onClick", "isLongClick", "__selectable5_Modifier", "selected", "__selectable5_onClick", "__selectable7_Modifier", "__selectable7_onClick", "__triStateToggleable5_Modifier", "state", "__triStateToggleable5_onClick", "__triStateToggleable7_Modifier", "__triStateToggleable7_onClick", "fsAddClass", "cls", "fsAttribute", "name", "value", "fsClass", "fsExclude", "fsExcludeWithoutConsent", "fsId", PreferencesHelper.PREF_ID, "fsMask", "fsMaskWithoutConsent", "fsTag", "tag", "fsUnmask", "fsUnmaskWithConsent", Log.TAG, "attributes", "", "classes", "", "api-compose_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullStoryAnnotationsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void __fullstory_onClick(Modifier modifier, boolean z10) {
        FS.compose_click(modifier, z10);
    }

    private static final Modifier __clickable_Modifier(Modifier modifier) {
        return modifier.any(new Function1<Modifier.b, Boolean>() { // from class: com.fullstory.compose.FullStoryAnnotationsKt.__clickable_Modifier.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Modifier.b it) {
                Intrinsics.j(it, "it");
                return Boolean.valueOf(it instanceof FullStoryClickModifier);
            }
        }) ? modifier : modifier.then(new FullStoryClickModifier());
    }

    private static final Function0<Unit> __clickable_onClick(Modifier modifier, Function0<Unit> function0) {
        return function0 instanceof FSClickHandler ? function0 : new FSClickHandler(modifier, function0);
    }

    private static final Function0<Unit> __clickable_onLongClick(Modifier modifier, Function0<Unit> function0) {
        if (function0 == null) {
            return null;
        }
        return function0 instanceof FSLongClickHandler ? function0 : new FSLongClickHandler(modifier, function0);
    }

    static /* synthetic */ Modifier __combinedClickable10_Modifier$default(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, String str2, Function0 function0, Function0 function02, Function0 function03, int i10, Object obj4) {
        if ((i10 & 64) != 0) {
            function0 = null;
        }
        if ((i10 & 128) != 0) {
            function02 = null;
        }
        return __combinedClickable10_Modifier(modifier, obj, obj2, z10, str, obj3, str2, function0, function02, function03);
    }

    static /* synthetic */ Function0 __combinedClickable10_onClick$default(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, String str2, Function0 function0, Function0 function02, Function0 function03, int i10, Object obj4) {
        if ((i10 & 64) != 0) {
            function0 = null;
        }
        if ((i10 & 128) != 0) {
            function02 = null;
        }
        return __combinedClickable10_onClick(modifier, obj, obj2, z10, str, obj3, str2, function0, function02, function03);
    }

    static /* synthetic */ Function0 __combinedClickable10_onLongClick$default(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, String str2, Function0 function0, Function0 function02, Function0 function03, int i10, Object obj4) {
        if ((i10 & 64) != 0) {
            function0 = null;
        }
        if ((i10 & 128) != 0) {
            function02 = null;
        }
        return __combinedClickable10_onLongClick(modifier, obj, obj2, z10, str, obj3, str2, function0, function02, function03);
    }

    public static final Function1<Object, Unit> __consumerToFunction1(final Consumer<Object> consumer) {
        return new Function1<Object, Unit>() { // from class: com.fullstory.compose.FullStoryAnnotationsKt.__consumerToFunction1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object it) {
                Intrinsics.j(it, "it");
                consumer.accept(it);
            }
        };
    }

    public static final Function0<Unit> __runnableToFunction0(final Runnable runnable) {
        return new Function0<Unit>() { // from class: com.fullstory.compose.FullStoryAnnotationsKt.__runnableToFunction0.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                runnable.run();
            }
        };
    }

    public static final Modifier fsAddClass(Modifier modifier, String cls) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(cls, "cls");
        return modifier.then(new FullStoryClass(cls));
    }

    public static final Modifier fsAttribute(Modifier modifier, String name, String value) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        return modifier.then(new FullStoryAttribute(name, value));
    }

    @Deprecated
    public static final Modifier fsClass(Modifier modifier, String cls) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(cls, "cls");
        return modifier.then(new FullStoryClass(cls));
    }

    public static final Modifier fsExclude(Modifier modifier) {
        Intrinsics.j(modifier, "<this>");
        return fsAddClass(modifier, FS.EXCLUDE_CLASS);
    }

    public static final Modifier fsExcludeWithoutConsent(Modifier modifier) {
        Intrinsics.j(modifier, "<this>");
        return fsAddClass(modifier, FS.EXCLUDE_WITHOUT_CONSENT_CLASS);
    }

    public static final Modifier fsId(Modifier modifier, String id2) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(id2, "id");
        return modifier.then(new FullStoryId(id2));
    }

    public static final Modifier fsMask(Modifier modifier) {
        Intrinsics.j(modifier, "<this>");
        return fsAddClass(modifier, FS.MASK_CLASS);
    }

    public static final Modifier fsMaskWithoutConsent(Modifier modifier) {
        Intrinsics.j(modifier, "<this>");
        return fsAddClass(modifier, FS.MASK_WITHOUT_CONSENT_CLASS);
    }

    public static final Modifier fsTag(Modifier modifier, String tag) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(tag, "tag");
        return modifier.then(new FullStoryTag(tag));
    }

    public static final Modifier fsUnmask(Modifier modifier) {
        Intrinsics.j(modifier, "<this>");
        return fsAddClass(modifier, FS.UNMASK_CLASS);
    }

    public static final Modifier fsUnmaskWithConsent(Modifier modifier) {
        Intrinsics.j(modifier, "<this>");
        return fsAddClass(modifier, FS.UNMASK_WITH_CONSENT_CLASS);
    }

    public static final Modifier fullstory(Modifier modifier, Map<String, String> map, List<String> list, String str, String str2) {
        Iterator<String> it;
        Intrinsics.j(modifier, "<this>");
        if (map != null && (r3 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                modifier = fsAttribute(modifier, entry.getKey(), entry.getValue());
            }
        }
        if (list != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                modifier = fsAddClass(modifier, it.next());
            }
        }
        if (str != null) {
            modifier = fsId(modifier, str);
        }
        return str2 != null ? fsTag(modifier, str2) : modifier;
    }

    public static /* synthetic */ Modifier fullstory$default(Modifier modifier, Map map, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return fullstory(modifier, map, list, str, str2);
    }

    public static final Modifier __clickable5_Modifier(Modifier modifier, boolean z10, String str, Object obj, Function0<Unit> function0) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __clickable5_onClick(Modifier modifier, boolean z10, String str, Object obj, Function0<Unit> function0) {
        return __clickable_onClick(modifier, function0);
    }

    public static final Modifier __clickable7_Modifier(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, Function0<Unit> function0) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __clickable7_onClick(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, Function0<Unit> function0) {
        return __clickable_onClick(modifier, function0);
    }

    public static final Modifier __combinedClickable10_Modifier(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __combinedClickable10_onClick(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        return __clickable_onClick(modifier, function03);
    }

    public static final Function0<Unit> __combinedClickable10_onLongClick(Modifier modifier, Object obj, Object obj2, boolean z10, String str, Object obj3, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        return __clickable_onLongClick(modifier, function0);
    }

    public static final Modifier __combinedClickable8_Modifier(Modifier modifier, boolean z10, String str, Object obj, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __combinedClickable8_onClick(Modifier modifier, boolean z10, String str, Object obj, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        return __clickable_onClick(modifier, function03);
    }

    public static final Function0<Unit> __combinedClickable8_onLongClick(Modifier modifier, boolean z10, String str, Object obj, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        return __clickable_onLongClick(modifier, function0);
    }

    public static final Modifier __selectable5_Modifier(Modifier modifier, boolean z10, boolean z11, Object obj, Function0<Unit> function0) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __selectable5_onClick(Modifier modifier, boolean z10, boolean z11, Object obj, Function0<Unit> function0) {
        return __clickable_onClick(modifier, function0);
    }

    public static final Modifier __selectable7_Modifier(Modifier modifier, boolean z10, Object obj, Object obj2, boolean z11, Object obj3, Function0<Unit> function0) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __selectable7_onClick(Modifier modifier, boolean z10, Object obj, Object obj2, boolean z11, Object obj3, Function0<Unit> function0) {
        return __clickable_onClick(modifier, function0);
    }

    public static final Modifier __triStateToggleable5_Modifier(Modifier modifier, Object obj, boolean z10, Object obj2, Function0<Unit> function0) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __triStateToggleable5_onClick(Modifier modifier, Object obj, boolean z10, Object obj2, Function0<Unit> function0) {
        return __clickable_onClick(modifier, function0);
    }

    public static final Modifier __triStateToggleable7_Modifier(Modifier modifier, Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Function0<Unit> function0) {
        return __clickable_Modifier(modifier);
    }

    public static final Function0<Unit> __triStateToggleable7_onClick(Modifier modifier, Object obj, Object obj2, Object obj3, boolean z10, Object obj4, Function0<Unit> function0) {
        return __clickable_onClick(modifier, function0);
    }
}
