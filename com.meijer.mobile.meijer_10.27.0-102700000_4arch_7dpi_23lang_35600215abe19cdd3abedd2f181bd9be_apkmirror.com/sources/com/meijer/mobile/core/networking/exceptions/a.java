package com.meijer.mobile.core.networking.exceptions;

import android.security.keystore.UserNotAuthenticatedException;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.core.util.networking.NoAvailableNetworksException;
import com.meijer.mobile.core.util.networking.NoExternalNetAccessException;
import com.meijer.mobile.core.util.networking.UnknownNetworkError;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "a", "(Ljava/lang/Throwable;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    public static final RetrofitException a(Throwable th2) throws Throwable {
        Intrinsics.j(th2, "<this>");
        if (th2 instanceof Error) {
            throw th2;
        }
        return th2 instanceof UserNotAuthenticatedException ? RetrofitException.INSTANCE.a((UserNotAuthenticatedException) th2) : th2 instanceof RetrofitException ? (RetrofitException) th2 : th2 instanceof NoAvailableNetworksException ? RetrofitException.INSTANCE.c((IOException) th2) : th2 instanceof NoExternalNetAccessException ? RetrofitException.INSTANCE.c((IOException) th2) : th2 instanceof UnknownNetworkError ? RetrofitException.INSTANCE.g(th2) : ((th2 instanceof IOException) && (th2.getCause() instanceof EOFException)) || (th2 instanceof ConnectException) ? new RetrofitException(RetrofitException.b.f96145e, th2) : th2 instanceof UnknownHostException ? new RetrofitException(RetrofitException.b.f96146f, th2) : th2 instanceof SocketTimeoutException ? new RetrofitException(RetrofitException.b.f96147g, th2) : th2 instanceof HttpException ? RetrofitException.INSTANCE.b((HttpException) th2) : RetrofitException.INSTANCE.g(th2);
    }
}
