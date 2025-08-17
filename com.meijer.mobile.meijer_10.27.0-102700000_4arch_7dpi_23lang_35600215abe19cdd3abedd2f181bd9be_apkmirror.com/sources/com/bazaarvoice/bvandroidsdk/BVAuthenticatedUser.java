package com.bazaarvoice.bvandroidsdk;

import Ic.a;
import L6.b;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.fullstory.FS;
import com.google.gson.Gson;
import java.net.URL;
import java.util.List;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
class BVAuthenticatedUser {
    static final int DISPATCH_SHOPPER_PROFILE_UPDATE = 1;
    static final int DISPATCH_SHOPPER_PROFILE_UPDATE_IF_NEEDED = 2;
    private static final String ENDPOINT_TEMPLATE = "users/magpie_idfa_%s?passkey=%s";
    private static final String SHOPPER_PROFILE_THREAD_NAME = "com.bazaarvoice.bvandroidsdk.BVAuthenticatedUser";
    private static final String TAG = "com.bazaarvoice.bvandroidsdk.BVAuthenticatedUser";
    private final String apiKey;
    private final Context applicationContext;
    private final String baseUrl;
    private final HandlerThread bgHandlerThread;
    private final BVLogger bvLogger;
    private final Gson gson;
    private final OkHttpClient okHttpClient;
    private final List<Integer> profilePollTimes;
    private ShopperProfile shopperProfile;
    private final Handler shopperProfileHandler;
    private String userAuthString;

    static class ShopperProfileHandler extends Handler {
        private final BVAuthenticatedUser bvAuthenticatedUser;

        private void update() throws Throwable {
            if (this.bvAuthenticatedUser.userAdIdEnabled()) {
                this.bvAuthenticatedUser.setShopperProfile(this.bvAuthenticatedUser.updateShopperProfile());
            }
        }

        private void updateIfNotSet() throws Throwable {
            if (this.bvAuthenticatedUser.haveShopperProfileInfo()) {
                return;
            }
            update();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i10 = message.what;
            if (i10 == 1) {
                update();
            } else {
                if (i10 != 2) {
                    return;
                }
                updateIfNotSet();
            }
        }

        public ShopperProfileHandler(Looper looper, BVAuthenticatedUser bVAuthenticatedUser) {
            super(looper);
            this.bvAuthenticatedUser = bVAuthenticatedUser;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShopperProfile(ShopperProfile shopperProfile) {
        synchronized (this) {
            this.shopperProfile = shopperProfile;
        }
    }

    ShopperProfile getShopperProfile() {
        ShopperProfile shopperProfile;
        synchronized (this) {
            shopperProfile = this.shopperProfile;
        }
        return shopperProfile;
    }

    String getUserAuthString() {
        String str;
        synchronized (this) {
            str = this.userAuthString;
        }
        return str;
    }

    public void setUserAuthString(String str) {
        synchronized (this) {
            this.userAuthString = str;
        }
    }

    private URL getUrl() {
        return b.j(this.baseUrl + String.format(ENDPOINT_TEMPLATE, AdIdRequestTask.getAdId(this.applicationContext).getAdId(), this.apiKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bazaarvoice.bvandroidsdk.ShopperProfile updateShopperProfile() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bazaarvoice.bvandroidsdk.BVAuthenticatedUser.updateShopperProfile():com.bazaarvoice.bvandroidsdk.ShopperProfile");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean userAdIdEnabled() {
        a.C0217a adInfo = AdIdRequestTask.getAdId(this.applicationContext).getAdInfo();
        return (adInfo == null || adInfo.b()) ? false : true;
    }

    public void updateUser(String str) {
        String str2 = this.apiKey;
        if (str2 == null || str2.equals("REPLACE_ME")) {
            this.bvLogger.w(TAG, "Do not call BVSDK#setUserAuthString() with an empty Recommendations API Key");
            return;
        }
        FS.log_v(TAG, "update user backoff start, bvsdk instance: " + hashCode() + " from " + str);
        this.shopperProfileHandler.removeMessages(1);
        this.shopperProfileHandler.removeMessages(2);
        for (int i10 = 0; i10 < this.profilePollTimes.size(); i10++) {
            int iIntValue = this.profilePollTimes.get(i10).intValue();
            if (i10 == 0) {
                Handler handler = this.shopperProfileHandler;
                handler.sendMessageDelayed(handler.obtainMessage(1), iIntValue);
            } else {
                Handler handler2 = this.shopperProfileHandler;
                handler2.sendMessageDelayed(handler2.obtainMessage(2), iIntValue);
            }
        }
    }

    BVAuthenticatedUser(Context context, String str, String str2, OkHttpClient okHttpClient, BVLogger bVLogger, Gson gson, List<Integer> list, HandlerThread handlerThread) {
        this.applicationContext = context;
        this.baseUrl = str;
        this.apiKey = str2;
        this.okHttpClient = okHttpClient;
        this.bvLogger = bVLogger;
        this.gson = gson;
        this.profilePollTimes = list;
        this.bgHandlerThread = handlerThread;
        this.shopperProfileHandler = new ShopperProfileHandler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean haveShopperProfileInfo() {
        ShopperProfile shopperProfile = getShopperProfile();
        if (shopperProfile != null && shopperProfile.getProfile() != null && shopperProfile.getProfile().getTargetingKeywords() != null && shopperProfile.getProfile().getTargetingKeywords().size() > 0) {
            return true;
        }
        return false;
    }
}
