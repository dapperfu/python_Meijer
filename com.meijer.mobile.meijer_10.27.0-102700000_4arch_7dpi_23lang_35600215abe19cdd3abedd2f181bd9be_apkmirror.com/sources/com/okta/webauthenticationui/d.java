package com.okta.webauthenticationui;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/okta/webauthenticationui/d;", "", "<init>", "()V", "b", "a", "Lcom/okta/webauthenticationui/d$a;", "Lcom/okta/webauthenticationui/d$b;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class d {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/okta/webauthenticationui/d$a;", "Lcom/okta/webauthenticationui/d;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exception) {
            super(null);
            Intrinsics.j(exception, "exception");
            this.exception = exception;
        }

        /* renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/okta/webauthenticationui/d$b;", "Lcom/okta/webauthenticationui/d;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri) {
            super(null);
            Intrinsics.j(uri, "uri");
            this.uri = uri;
        }

        /* renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
