package com.meijer.mobile.core.error.model.common;

import Xj.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/core/error/model/common/RestException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LXj/b;", "restError", "", "cause", "<init>", "(LXj/b;Ljava/lang/Throwable;)V", "a", "LXj/b;", "()LXj/b;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RestException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b restError;

    public RestException(b bVar, Throwable th2) {
        super(bVar != null ? bVar.e() : null, th2);
        this.restError = bVar;
    }

    /* renamed from: a, reason: from getter */
    public final b getRestError() {
        return this.restError;
    }
}
