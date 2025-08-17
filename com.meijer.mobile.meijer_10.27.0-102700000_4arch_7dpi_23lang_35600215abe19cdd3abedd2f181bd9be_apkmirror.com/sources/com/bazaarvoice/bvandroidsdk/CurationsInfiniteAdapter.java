package com.bazaarvoice.bvandroidsdk;

import O6.b;
import O6.c;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bazaarvoice.bvandroidsdk.CurationsInfiniteContract;
import com.bazaarvoice.bvandroidsdk.CurationsInfiniteRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class CurationsInfiniteAdapter extends RecyclerView.h<RecyclerView.F> {
    private static final String SERVICE_IMAGE_TEMPLATE = "%1$s&width=%2$d&height=%3$d";
    private final CurationsInfiniteRecyclerView.OnFeedItemClickListener feedItemClickListener;
    private final List<CurationsFeedItem> feedItems = new ArrayList();
    private final CurationsImageLoader imageLoader;
    private final CurationsInfiniteContract.ViewProps viewProps;

    private enum Channel {
        INSTAGRAM("instagram"),
        BAZAARVOICE("bazaarvoice"),
        FACEBOOK("facebook"),
        GOOGLE_PLUS("google-plus"),
        PINTEREST("pinterest"),
        PLAY("play"),
        TWITTER("twitter"),
        YOUTUBE("youtube");

        private String name;

        public static Channel toChannel(String str) {
            Channel channel = INSTAGRAM;
            if (str.equals(channel.getName())) {
                return channel;
            }
            Channel channel2 = BAZAARVOICE;
            if (str.equals(channel2.getName())) {
                return channel2;
            }
            Channel channel3 = FACEBOOK;
            if (str.equals(channel3.getName())) {
                return channel3;
            }
            Channel channel4 = GOOGLE_PLUS;
            if (str.equals(channel4.getName())) {
                return channel4;
            }
            Channel channel5 = PINTEREST;
            if (str.equals(channel5.getName())) {
                return channel5;
            }
            Channel channel6 = PLAY;
            if (str.equals(channel6.getName())) {
                return channel6;
            }
            Channel channel7 = TWITTER;
            if (str.equals(channel7.getName())) {
                return channel7;
            }
            Channel channel8 = YOUTUBE;
            if (str.equals(channel8.getName())) {
                return channel8;
            }
            return null;
        }

        public String getName() {
            return this.name;
        }

        Channel(String str) {
            this.name = str;
        }
    }

    private static class CurationFeedItemClickListener implements View.OnClickListener {
        private final CurationsFeedItem curationsFeedItem;
        private final CurationsInfiniteRecyclerView.OnFeedItemClickListener feedItemClickListener;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CurationsInfiniteRecyclerView.OnFeedItemClickListener onFeedItemClickListener = this.feedItemClickListener;
            if (onFeedItemClickListener != null) {
                onFeedItemClickListener.onClick(this.curationsFeedItem);
            }
        }

        public CurationFeedItemClickListener(CurationsInfiniteRecyclerView.OnFeedItemClickListener onFeedItemClickListener, CurationsFeedItem curationsFeedItem) {
            this.feedItemClickListener = onFeedItemClickListener;
            this.curationsFeedItem = curationsFeedItem;
        }
    }

    private static class CurationsInfiniteViewHolder extends RecyclerView.F {
        private ImageView brandImageView;
        private CurationsView container;
        private CurationsAspectRatioImageView imageView;

        CurationsInfiniteViewHolder(View view) {
            super(view);
            CurationsView curationsView = (CurationsView) view;
            this.container = curationsView;
            this.imageView = (CurationsAspectRatioImageView) curationsView.findViewById(b.f23304c);
            this.brandImageView = (ImageView) this.container.findViewById(b.f23302a);
        }
    }

    private void cancelRequestIfExists(ImageView imageView) {
        Object tag = this.imageLoader.getTag(imageView);
        if (tag != null) {
            this.imageLoader.cancel(tag);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private String getPhotoThumbnailUrl(CurationsFeedItem curationsFeedItem) {
        String str;
        CurationsInfiniteRecyclerView.ImageSize imageSize = CurationsInfiniteRecyclerView.getImageSize(this.viewProps);
        List<CurationsPhoto> photos = curationsFeedItem.getPhotos();
        if (photos == null || photos.isEmpty()) {
            str = null;
        } else {
            String imageServiceUrl = photos.get(0).getImageServiceUrl();
            if (imageServiceUrl == null) {
                return null;
            }
            str = String.format(SERVICE_IMAGE_TEMPLATE, imageServiceUrl, Integer.valueOf(imageSize.getWidthPixels()), Integer.valueOf(imageSize.getHeightPixels()));
        }
        List<CurationsVideo> videos = curationsFeedItem.getVideos();
        if (videos == null || videos.isEmpty()) {
            return str;
        }
        String imageServiceUrl2 = videos.get(0).getImageServiceUrl();
        if (imageServiceUrl2 == null) {
            return null;
        }
        return String.format(SERVICE_IMAGE_TEMPLATE, imageServiceUrl2, Integer.valueOf(imageSize.getWidthPixels()), Integer.valueOf(imageSize.getHeightPixels()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return this.feedItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i10) throws Resources.NotFoundException {
        CurationsInfiniteViewHolder curationsInfiniteViewHolder = (CurationsInfiniteViewHolder) f10;
        CurationsFeedItem curationsFeedItem = this.feedItems.get(i10);
        curationsInfiniteViewHolder.container.setCurationsFeedItem(curationsFeedItem);
        curationsInfiniteViewHolder.container.setOnClickListener(new CurationFeedItemClickListener(this.feedItemClickListener, curationsFeedItem));
        CurationsAspectRatioImageView curationsAspectRatioImageView = curationsInfiniteViewHolder.imageView;
        cancelRequestIfExists(curationsAspectRatioImageView);
        loadImageIntoImageView(curationsFeedItem, curationsAspectRatioImageView);
        loadBrandIntoBrandView(curationsFeedItem, curationsInfiniteViewHolder.brandImageView);
    }

    void update(List<CurationsFeedItem> list) {
        this.feedItems.addAll(list);
        notifyDataSetChanged();
    }

    CurationsInfiniteAdapter(CurationsInfiniteContract.ViewProps viewProps, CurationsImageLoader curationsImageLoader, CurationsInfiniteRecyclerView.OnFeedItemClickListener onFeedItemClickListener) {
        this.viewProps = viewProps;
        this.imageLoader = curationsImageLoader;
        this.feedItemClickListener = onFeedItemClickListener;
    }

    private void loadBrandIntoBrandView(CurationsFeedItem curationsFeedItem, ImageView imageView) throws Resources.NotFoundException {
        int i10;
        String channel = curationsFeedItem.getChannel();
        if (channel == null) {
            imageView.setVisibility(8);
            return;
        }
        Channel channel2 = Channel.toChannel(channel);
        if (channel2 == null) {
            imageView.setVisibility(8);
            return;
        }
        switch (channel2) {
            case INSTAGRAM:
                i10 = O6.a.f23297d;
                break;
            case BAZAARVOICE:
                i10 = O6.a.f23294a;
                break;
            case FACEBOOK:
                i10 = O6.a.f23295b;
                break;
            case GOOGLE_PLUS:
                i10 = O6.a.f23296c;
                break;
            case PINTEREST:
                i10 = O6.a.f23298e;
                break;
            case PLAY:
                i10 = O6.a.f23299f;
                break;
            case TWITTER:
                i10 = O6.a.f23300g;
                break;
            case YOUTUBE:
                i10 = O6.a.f23301h;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            Drawable drawable = imageView.getResources().getDrawable(i10, imageView.getContext().getTheme());
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    private void loadImageIntoImageView(CurationsFeedItem curationsFeedItem, ImageView imageView) {
        String photoThumbnailUrl = getPhotoThumbnailUrl(curationsFeedItem);
        if (photoThumbnailUrl != null) {
            imageView.setTag(photoThumbnailUrl);
            CurationsInfiniteRecyclerView.ImageSize imageSize = CurationsInfiniteRecyclerView.getImageSize(this.viewProps);
            this.imageLoader.loadInto(imageView, photoThumbnailUrl, imageSize.getWidthPixels(), imageSize.getHeightPixels());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        CurationsView curationsView = (CurationsView) LayoutInflater.from(viewGroup.getContext()).inflate(c.f23305a, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) curationsView.findViewById(b.f23303b);
        ((CurationsAspectRatioImageView) curationsView.findViewById(b.f23304c)).setRatio(this.viewProps.getCurationCellWidthRatio(), this.viewProps.getCurationCellHeightRatio());
        boolean zIsVertical = CurationsInfiniteRecyclerView.isVertical(this.viewProps);
        RecyclerView.q qVar = (RecyclerView.q) curationsView.getLayoutParams();
        int i14 = -2;
        if (zIsVertical) {
            i11 = -1;
        } else {
            i11 = -2;
        }
        ((ViewGroup.MarginLayoutParams) qVar).width = i11;
        if (zIsVertical) {
            i12 = -2;
        } else {
            i12 = -1;
        }
        ((ViewGroup.MarginLayoutParams) qVar).height = i12;
        curationsView.setLayoutParams(qVar);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (zIsVertical) {
            i13 = -1;
        } else {
            i13 = -2;
        }
        layoutParams.width = i13;
        if (!zIsVertical) {
            i14 = -1;
        }
        layoutParams.height = i14;
        relativeLayout.setLayoutParams(layoutParams);
        return new CurationsInfiniteViewHolder(curationsView);
    }
}
