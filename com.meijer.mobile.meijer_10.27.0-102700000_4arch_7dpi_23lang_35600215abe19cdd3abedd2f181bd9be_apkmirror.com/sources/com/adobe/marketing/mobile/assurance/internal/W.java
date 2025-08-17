package com.adobe.marketing.mobile.assurance.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/W;", "", "T", "V", "<init>", "()V", "a", "b", "Lcom/adobe/marketing/mobile/assurance/internal/W$a;", "Lcom/adobe/marketing/mobile/assurance/internal/W$b;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class W<T, V> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/W$a;", "", "T", "V", "Lcom/adobe/marketing/mobile/assurance/internal/W;", "error", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<T, V> extends W<T, V> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final V error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V error) {
            super(null);
            Intrinsics.j(error, "error");
            this.error = error;
        }

        public final V a() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/W$b;", "", "T", "V", "Lcom/adobe/marketing/mobile/assurance/internal/W;", "data", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<T, V> extends W<T, V> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T data) {
            super(null);
            Intrinsics.j(data, "data");
            this.data = data;
        }

        public final T a() {
            return this.data;
        }
    }

    public /* synthetic */ W(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private W() {
    }
}
