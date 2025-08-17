package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertySubscriber;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g extends NativePropertyBehaviorSubject {

    /* renamed from: a, reason: collision with root package name */
    public final String f122939a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f122940b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f122941c;

    public g(String keyName, String str) throws JSONException {
        Intrinsics.j(keyName, "keyName");
        this.f122939a = keyName;
        this.f122940b = new CopyOnWriteArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", keyName);
        jSONObject.put("value", str);
        this.f122941c = jSONObject;
    }

    public final void a(JSONObject jsonObject) {
        Intrinsics.j(jsonObject, "newValue");
        if (Intrinsics.e(jsonObject, this.f122941c)) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f122940b;
        Intrinsics.j(copyOnWriteArrayList, "<this>");
        Intrinsics.j(jsonObject, "jsonObject");
        String jsonString = jsonObject.toString();
        Intrinsics.i(jsonString, "toString(...)");
        Intrinsics.j(copyOnWriteArrayList, "<this>");
        Intrinsics.j(jsonString, "jsonString");
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((NativePropertySubscriber) it.next()).onPropertyChanged(new JSONObject(jsonString));
        }
        this.f122941c = jsonObject;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject
    public final void addSubscriber(NativePropertySubscriber nativePropertySubscriber) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f122940b;
        Intrinsics.j(copyOnWriteArrayList, "<this>");
        if (nativePropertySubscriber != null) {
            copyOnWriteArrayList.add(nativePropertySubscriber);
        }
        if (nativePropertySubscriber != null) {
            List listE = CollectionsKt.e(nativePropertySubscriber);
            JSONObject jsonObject = this.f122941c;
            Intrinsics.j(listE, "<this>");
            Intrinsics.j(jsonObject, "jsonObject");
            String jsonString = jsonObject.toString();
            Intrinsics.i(jsonString, "toString(...)");
            Intrinsics.j(listE, "<this>");
            Intrinsics.j(jsonString, "jsonString");
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                ((NativePropertySubscriber) it.next()).onPropertyChanged(new JSONObject(jsonString));
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject
    public final void removeSubscriber(NativePropertySubscriber nativePropertySubscriber) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f122940b;
        Intrinsics.j(copyOnWriteArrayList, "<this>");
        if (nativePropertySubscriber != null) {
            copyOnWriteArrayList.remove(nativePropertySubscriber);
        }
    }
}
