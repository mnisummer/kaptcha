package com.google.code.kaptcha.impl;

import com.google.code.kaptcha.GimpyEngine;
import com.google.code.kaptcha.util.Configurable;

import java.awt.image.BufferedImage;

/**
 * {@link NoGimpy} adds nothing to the text on the image.
 */
public class NoGimpy extends Configurable implements GimpyEngine
{
	/**
	 * Applies distortion by adding shadow to the text and also two noises.
	 *
	 * @param baseImage the base image
	 * @return the distorted image
	 */
	public BufferedImage getDistortedImage(BufferedImage baseImage)
	{
		//do nothing.
		return baseImage;
	}
}
