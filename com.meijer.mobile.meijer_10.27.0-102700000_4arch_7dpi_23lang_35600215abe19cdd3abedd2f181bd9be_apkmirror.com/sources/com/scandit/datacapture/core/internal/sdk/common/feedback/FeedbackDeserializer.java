package com.scandit.datacapture.core.internal.sdk.common.feedback;

import com.scandit.datacapture.core.common.feedback.AssetSound;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.feedback.WaveFormVibration;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/feedback/FeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "fromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/common/feedback/Feedback;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class FeedbackDeserializer {
    public static final FeedbackDeserializer INSTANCE = new FeedbackDeserializer();

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f125410a = {"default", "selectionHaptic", "successHaptic", "impactHaptic", "impactHapticLight", "failureHaptic"};

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final Feedback fromJson(JsonValue json) {
        T tDefaultSound;
        T waveFormVibration;
        Intrinsics.j(json, "json");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        JsonValue byKeyAsObject = json.getByKeyAsObject("vibration", null);
        if (byKeyAsObject != null) {
            String byKeyAsString = byKeyAsObject.getByKeyAsString("type", "default");
            String[] strArr = f125410a;
            if (ArraysKt.Y(strArr, byKeyAsString)) {
                waveFormVibration = Vibration.INSTANCE.defaultVibration();
            } else {
                if (!Intrinsics.e(byKeyAsString, "waveForm")) {
                    throw new IllegalStateException((byKeyAsObject.getAbsolutePath() + ".type is required to be one of [" + ArraysKt.C0(strArr, null, null, null, 0, null, null, 63, null) + ", waveForm].").toString());
                }
                ArrayList arrayList = new ArrayList();
                JsonValue byKeyAsArray = byKeyAsObject.getByKeyAsArray("timings", null);
                if (byKeyAsArray != null) {
                    int size = (int) byKeyAsArray.getSize();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList.add(Integer.valueOf(byKeyAsArray.requireByIndex(i10).asInt()));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                JsonValue byKeyAsArray2 = byKeyAsObject.getByKeyAsArray("amplitudes", null);
                if (byKeyAsArray2 != null) {
                    int size2 = (int) byKeyAsArray2.getSize();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList2.add(Integer.valueOf(byKeyAsArray2.requireByIndex(i11).asInt()));
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(((Number) it.next()).intValue()));
                }
                waveFormVibration = new WaveFormVibration(CollectionsKt.k1(arrayList3), arrayList2.isEmpty() ? null : CollectionsKt.i1(arrayList2));
            }
            objectRef.f142835a = waveFormVibration;
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("sound", null);
        if (byKeyAsObject2 != null) {
            if (byKeyAsObject2.contains("resource")) {
                String strRequireByKeyAsString = byKeyAsObject2.requireByKeyAsString("resource");
                if (StringsKt.r0(strRequireByKeyAsString)) {
                    throw new IllegalStateException((byKeyAsObject2.getAbsolutePath() + " does not reference a valid asset file in assets/ .").toString());
                }
                tDefaultSound = new AssetSound(strRequireByKeyAsString);
            } else {
                tDefaultSound = Sound.INSTANCE.defaultSound();
            }
            objectRef2.f142835a = tDefaultSound;
        }
        return new Feedback((Vibration) objectRef.f142835a, (Sound) objectRef2.f142835a);
    }

    private FeedbackDeserializer() {
    }
}
