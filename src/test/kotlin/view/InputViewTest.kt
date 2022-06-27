package view

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource

/**
 * Created by Jaesungchi on 2022.06.28..
 */
class InputViewTest {
    @Test
    fun `높이가 양수가 아닌경우 IllegalArgumentException을 던진다`() {
        assertThrows<IllegalArgumentException> {
            InputView.getHeight { "0" }
        }
    }

    @Test
    fun `높이가 숫자가 아닌경우 IllegalArgumentException을 던진다`() {
        assertThrows<IllegalArgumentException> {
            InputView.getHeight { "hihi" }
        }
    }

    @ParameterizedTest
    @NullAndEmptySource
    fun `높이에 빈칸이 오는 경우 IllegalArgumentException을 던진다`(source: String?) {
        assertThrows<IllegalArgumentException> {
            InputView.getHeight { source }
        }
    }

    @Test
    fun `너비가 양수가 아닌경우 IllegalArgumentException을 던진다`() {
        assertThrows<IllegalArgumentException> {
            InputView.getWidth { "0" }
        }
    }

    @Test
    fun `너비가 숫자가 아닌경우 IllegalArgumentException을 던진다`() {
        assertThrows<IllegalArgumentException> {
            InputView.getWidth { "hihi" }
        }
    }

    @ParameterizedTest
    @NullAndEmptySource
    fun `너비에 빈칸이 오는 경우 IllegalArgumentException을 던진다`(source: String?) {
        assertThrows<IllegalArgumentException> {
            InputView.getWidth { source }
        }
    }

    @Test
    fun `지뢰갯수가 양수가 아닌경우 IllegalArgumentException을 던진다`() {
        assertThrows<IllegalArgumentException> {
            InputView.getMineCount { "0" }
        }
    }

    @Test
    fun `지뢰갯수가 숫자가 아닌경우 IllegalArgumentException을 던진다`() {
        assertThrows<IllegalArgumentException> {
            InputView.getMineCount { "hihi" }
        }
    }

    @ParameterizedTest
    @NullAndEmptySource
    fun `지뢰갯수에 빈칸이 오는 경우 IllegalArgumentException을 던진다`(source: String?) {
        assertThrows<IllegalArgumentException> {
            InputView.getMineCount { source }
        }
    }
}
