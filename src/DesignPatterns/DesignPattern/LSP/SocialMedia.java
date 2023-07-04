package DesignPattern.LSP;

public interface SocialMedia {
    /*
    // post content/video/images
    // chat
    // group video call
    // add friends
    // join group
     */
}

class Facebook implements  SocialMedia
{

}

class Whatsapp implements  SocialMedia
{
    // but here whatsapp violates Liskov subsititution principle
    // not supporting certain mentioned feature of social media
}
