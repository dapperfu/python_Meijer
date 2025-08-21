package com.meijer.mobile.models;

import Mv.b;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.meijer.mobile.gateway.apim.BuildConfig;
import java.io.IOException;
import java.net.URL;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.d;

/* loaded from: classes10.dex */
public class CaptivePortalTester implements b {

    /* renamed from: a, reason: collision with root package name */
    private CaptivePortalTesterListener f114372a;

    /* renamed from: b, reason: collision with root package name */
    private OkHttpClient f114373b;
    public final String URL_TO_TEST = BuildConfig.MEIJER_WEB_BASE_URL;

    /* renamed from: c, reason: collision with root package name */
    private CaptivePortalState f114374c = CaptivePortalState.NOT_TESTED;

    public enum CaptivePortalState {
        NOT_TESTED,
        IS_CAPTIVE_PORTAL,
        CONNECTED
    }

    public interface CaptivePortalTesterListener {
        void onCaptivePortalResults(CaptivePortalState captivePortalState);
    }

    public void unregister() {
        this.f114372a = null;
    }

    public void resetCaptivePortalFlag() {
        this.f114374c = CaptivePortalState.NOT_TESTED;
    }

    public void testForCaptivePortal(CaptivePortalTesterListener captivePortalTesterListener) {
        CaptivePortalState captivePortalState = this.f114374c;
        if (captivePortalState == CaptivePortalState.CONNECTED) {
            captivePortalTesterListener.onCaptivePortalResults(captivePortalState);
            unregister();
        } else {
            Request requestB = new Request.a().t(BuildConfig.MEIJER_WEB_BASE_URL).b();
            this.f114372a = captivePortalTesterListener;
            FirebasePerfOkHttpClient.enqueue(this.f114373b.b(requestB), this);
        }
    }

    public CaptivePortalTester(OkHttpClient okHttpClient) {
        this.f114373b = okHttpClient;
    }

    @Override // Mv.b
    public void onFailure(d dVar, IOException iOException) {
        unregister();
    }

    @Override // Mv.b
    public void onResponse(d dVar, Response response) {
        CaptivePortalState captivePortalState;
        try {
            try {
                if (!response.getRequest().getUrl().getHost().equals(new URL(BuildConfig.MEIJER_WEB_BASE_URL).getHost())) {
                    captivePortalState = CaptivePortalState.IS_CAPTIVE_PORTAL;
                } else {
                    captivePortalState = CaptivePortalState.CONNECTED;
                }
                this.f114374c = captivePortalState;
            } catch (IOException unused) {
                this.f114374c = CaptivePortalState.NOT_TESTED;
            }
            response.close();
            CaptivePortalTesterListener captivePortalTesterListener = this.f114372a;
            if (captivePortalTesterListener != null) {
                captivePortalTesterListener.onCaptivePortalResults(this.f114374c);
            }
            unregister();
        } catch (Throwable th2) {
            response.close();
            throw th2;
        }
    }
}
