package com.radiusnetworks.flybuy.sdk.data.common;

import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "type", "Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;", "code", "", "messages", "", "", "", "(Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;ILjava/util/Map;)V", "getCode", "()I", "getType", "()Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;", "description", "userError", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class SdkError {
    private final int code;
    private final Map<String, List<String>> messages;
    private final ResponseEventType type;

    /* JADX WARN: Multi-variable type inference failed */
    public SdkError(ResponseEventType type, int i10, Map<String, ? extends List<String>> messages) {
        Intrinsics.j(type, "type");
        Intrinsics.j(messages, "messages");
        this.type = type;
        this.code = i10;
        this.messages = messages;
    }

    public String description() {
        return userError();
    }

    public final int getCode() {
        return this.code;
    }

    public final ResponseEventType getType() {
        return this.type;
    }

    public String userError() {
        return CollectionsKt.B0(this.messages.values(), "\n", null, null, 0, null, new Function1<List<? extends String>, CharSequence>() { // from class: com.radiusnetworks.flybuy.sdk.data.common.SdkError.userError.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(List<String> it) {
                Intrinsics.j(it, "it");
                return CollectionsKt.B0(it, "\n", null, null, 0, null, null, 62, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(List<? extends String> list) {
                return invoke2((List<String>) list);
            }
        }, 30, null);
    }
}
